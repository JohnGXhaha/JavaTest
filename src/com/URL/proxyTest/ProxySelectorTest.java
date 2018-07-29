package com.URL.proxyTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


//ProxySelector自动选择代理服务
public class ProxySelectorTest {
	private String urlStr="129.82.12.188";
	
	public void init() throws IOException {
		ProxySelector.setDefault(new ProxySelector() {

			@Override
			public List<Proxy> select(URI uri) {
				List<Proxy> lp=new ArrayList<>();
				lp.add(new Proxy(Proxy.Type.HTTP,
						new InetSocketAddress(urlStr,3124) 
				));
				return lp;
			}

			@Override
			public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
				// TODO Auto-generated method stub
				System.out.println("无法连接");
			}
			
		});
		
		URL url=new URL(urlStr);
		URLConnection urlconn=url.openConnection();
	}
}
