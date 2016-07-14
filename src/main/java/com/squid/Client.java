package com.squid;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("client staring");
			socket = new Socket("127.0.0.1", 8000);
			String str = "Hello world";
			OutputStream output = socket.getOutputStream();
			output.write(str.getBytes());
			output.flush();
			System.out.println("client send message");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("client close");
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}

	}
}
