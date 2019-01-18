package org.golde.naturalreadervoiceapi;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;

public class TTSMain {
	
	public static void main(String[] args) throws IOException {
		
		downloadTTS(Voice.English.US.Tracy, 1, "Hello world this is a test");
	}
	
	private static void downloadTTS(Voice voice, int speed, String text) throws IOException {
		OkHttpClient client = new OkHttpClient();

		RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"t\":\"" + text + "\"}");
		
		Request request = new Request.Builder()
		  .url("https://kfiuqykx63.execute-api.us-east-1.amazonaws.com/Dev/tts?r=" + voice.r + "&s=" + speed + "&l=" + voice.l + "&v=" + voice.v)
		  .post(body)
		  .addHeader("Accept", "*/*")
		  .addHeader("Content-Type", "application/x-www-form-urlencoded")
		  .addHeader("Origin", "https://www.naturalreaders.com")
		  .addHeader("Referer", "https://www.naturalreaders.com/online/")
		  .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();
		
		String fileName = text.replaceAll("[^a-zA-Z0-9\\._]+", "_") + ".mp3";
		File downloadedFile = new File(fileName);
	    BufferedSink sink = Okio.buffer(Okio.sink(downloadedFile));
	    sink.writeAll(response.body().source());
	    sink.close();
	}

}
