package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void fastJsonTest(){
		String jsonString="{\"TimeStamp\": \"2022-01-02T13:01:34Z\", \"A\": {\"Identification\": \"nnn1-mia5\", \"QueryLatency\": {\"Ipv4_udp\": \"288\", \"Ipv4_tcp\": \"296\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"198.41.0.4\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.117\", \"Router6\": \"218.203.72.77\", \"Router7\": \"111.24.10.25\", \"Router8\": \"221.183.119.169\", \"Router9\": \"111.24.17.106\", \"Router10\": \"221.176.16.214\", \"Router11\": \"221.183.52.1\", \"Router12\": \"221.183.55.109\", \"Router13\": \"223.120.12.213\", \"Router14\": \"223.120.6.98\", \"Router15\": \"223.118.10.193\", \"Router16\": \"223.118.10.254\", \"Router17\": \"223.118.11.110\", \"Router18\": \"223.118.11.130\", \"Router19\": \"198.32.242.166\", \"Router20\": \"209.131.134.127\", \"Router21\": \"198.41.0.4\"}, \"Path_count_ipv4\": 22, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"36\", \"114DNS\": \"48\", \"DNSPod\": \"60\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"B\": {\"Identification\": \"b3-ari\", \"QueryLatency\": {\"Ipv4_udp\": \"500\", \"Ipv4_tcp\": \"492\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"199.9.14.201\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.117\", \"Router6\": \"218.203.72.77\", \"Router7\": \"111.24.10.25\", \"Router8\": \"111.24.2.173\", \"Router9\": \"111.24.2.250\", \"Router10\": \"221.176.21.190\", \"Router11\": \"221.183.52.1\", \"Router12\": \"221.183.55.109\", \"Router13\": \"223.120.16.21\", \"Router14\": \"223.120.10.86\", \"Router15\": \"149.29.9.161\", \"Router16\": \"154.25.12.66\", \"Router17\": \"130.117.48.210\", \"Router18\": \"154.54.58.238\", \"Router19\": \"154.54.61.117\", \"Router20\": \"154.54.85.245\", \"Router21\": \"154.54.24.222\", \"Router22\": \"154.54.28.50\", \"Router23\": \"154.54.47.30\", \"Router24\": \"38.142.154.74\", \"Router25\": \"170.247.92.54\", \"Router26\": \"199.9.14.201\"}, \"Path_count_ipv4\": 27, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"48\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"C\": {\"Identification\": \"lax1a.c.root-servers.org\", \"QueryLatency\": {\"Ipv4_udp\": \"516\", \"Ipv4_tcp\": \"3420\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.33.4.12\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.77\", \"Router7\": \"111.24.10.25\", \"Router8\": \"111.24.2.173\", \"Router9\": \"111.24.2.246\", \"Router10\": \"221.176.21.190\", \"Router11\": \"221.183.25.202\", \"Router12\": \"221.183.55.109\", \"Router13\": \"223.120.12.213\", \"Router14\": \"223.120.6.218\", \"Router15\": \"38.104.85.161\", \"Router16\": \"154.54.27.117\", \"Router17\": \"154.54.27.138\", \"Router18\": \"192.33.4.12\"}, \"Path_count_ipv4\": 19, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"28\", \"114DNS\": \"52\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"D\": {\"Identification\": \"ffde8.droot.maxgigapop.net\", \"QueryLatency\": {\"Ipv4_udp\": \"300\", \"Ipv4_tcp\": \"300\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"199.7.91.13\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.113\", \"Router6\": \"* * *\", \"Router7\": \"111.24.10.9\", \"Router8\": \"221.183.117.25\", \"Router9\": \"111.24.2.98\", \"Router10\": \"221.176.21.230\", \"Router11\": \"221.183.46.249\", \"Router12\": \"221.183.30.226\", \"Router13\": \"80.81.194.42\", \"Router14\": \"199.7.91.13\"}, \"Path_count_ipv4\": 15, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"52\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"E\": {\"Identification\": \"p06.fra.eroot\", \"QueryLatency\": {\"Ipv4_udp\": \"308\", \"Ipv4_tcp\": \"320\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.203.230.10\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.117\", \"Router6\": \"218.203.72.77\", \"Router7\": \"111.24.10.25\", \"Router8\": \"221.183.119.177\", \"Router9\": \"111.24.2.246\", \"Router10\": \"221.176.21.186\", \"Router11\": \"221.183.46.253\", \"Router12\": \"221.183.30.226\", \"Router13\": \"80.81.194.42\", \"Router14\": \"192.203.230.10\"}, \"Path_count_ipv4\": 15, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"28\", \"114DNS\": \"56\", \"DNSPod\": \"52\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"F\": {\"Identification\": \"pek2b.f.root-servers.org\", \"QueryLatency\": {\"Ipv4_udp\": \"32\", \"Ipv4_tcp\": \"36\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.5.5.241\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.13\", \"Router7\": \"221.183.47.249\", \"Router8\": \"* * *\", \"Router9\": \"* * *\", \"Router10\": \"221.176.23.42\", \"Router11\": \"159.226.254.73\", \"Router12\": \"159.226.254.162\", \"Router13\": \"192.168.1.202\", \"Router14\": \"218.241.107.90\", \"Router15\": \"192.5.5.241\"}, \"Path_count_ipv4\": 16, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"36\", \"114DNS\": \"52\", \"DNSPod\": \"52\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"G\": {\"Identification\": \"groot-pac2-1\", \"QueryLatency\": {\"Ipv4_udp\": \"148\", \"Ipv4_tcp\": \"148\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.112.36.4\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.13\", \"Router7\": \"111.24.10.9\", \"Router8\": \"221.183.100.50\", \"Router9\": \"221.183.103.166\", \"Router10\": \"111.24.4.234\", \"Router11\": \"221.176.18.114\", \"Router12\": \"221.176.24.134\", \"Router13\": \"223.118.10.2\", \"Router14\": \"223.120.2.118\", \"Router15\": \"4.68.75.241\", \"Router16\": \"4.68.74.46\", \"Router17\": \"67.14.18.70\", \"Router18\": \"* * *\", \"Router19\": \"* * *\", \"Router20\": \"* * *\", \"Router21\": \"* * *\", \"Router22\": \"* * *\", \"Router23\": \"* * *\", \"Router24\": \"* * *\", \"Router25\": \"* * *\", \"Router26\": \"* * *\", \"Router27\": \"* * *\", \"Router28\": \"* * *\", \"Router29\": \"* * *\", \"Router30\": \"* * *\"}, \"Path_count_ipv4\": 31, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"40\", \"114DNS\": \"52\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"H\": {\"Identification\": \"001.nzy.h.root-servers.org\", \"QueryLatency\": {\"Ipv4_udp\": \"340\", \"Ipv4_tcp\": \"332\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"198.97.190.53\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.113\", \"Router6\": \"218.203.72.13\", \"Router7\": \"111.24.10.9\", \"Router8\": \"221.183.117.41\", \"Router9\": \"111.24.2.106\", \"Router10\": \"221.176.21.146\", \"Router11\": \"221.183.46.253\", \"Router12\": \"221.183.30.222\", \"Router13\": \"223.120.10.194\", \"Router14\": \"223.120.14.126\", \"Router15\": \"* * *\", \"Router16\": \"* * *\", \"Router17\": \"4.68.39.221\", \"Router18\": \"* * *\", \"Router19\": \"4.68.110.174\", \"Router20\": \"67.14.34.82\", \"Router21\": \"65.119.103.246\", \"Router22\": \"143.56.224.178\", \"Router23\": \"198.97.190.53\"}, \"Path_count_ipv4\": 24, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"36\", \"114DNS\": \"52\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"I\": {\"Identification\": \"s1.she\", \"QueryLatency\": {\"Ipv4_udp\": \"28\", \"Ipv4_tcp\": \"16\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.36.148.17\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.117\", \"Router6\": \"218.203.72.77\", \"Router7\": \"* * *\", \"Router8\": \"221.183.42.49\", \"Router9\": \"221.183.39.230\", \"Router10\": \"211.137.46.30\", \"Router11\": \"221.180.172.57\", \"Router12\": \"221.180.172.18\", \"Router13\": \"192.36.148.17\"}, \"Path_count_ipv4\": 14, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"48\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"J\": {\"Identification\": \"rootns-elpek3\", \"QueryLatency\": {\"Ipv4_udp\": \"28\", \"Ipv4_tcp\": \"28\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"192.58.128.30\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.13\", \"Router7\": \"221.183.47.249\", \"Router8\": \"* * *\", \"Router9\": \"* * *\", \"Router10\": \"221.176.23.42\", \"Router11\": \"159.226.254.73\", \"Router12\": \"159.226.254.162\", \"Router13\": \"192.168.1.202\", \"Router14\": \"218.241.102.102\", \"Router15\": \"192.58.128.30\"}, \"Path_count_ipv4\": 16, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"52\", \"DNSPod\": \"52\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"K\": {\"Identification\": \"ns3.us-mia.k.ripe.net\", \"QueryLatency\": {\"Ipv4_udp\": \"388\", \"Ipv4_tcp\": \"388\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"193.0.14.129\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"218.203.34.113\", \"Router6\": \"218.203.72.13\", \"Router7\": \"111.24.10.9\", \"Router8\": \"221.183.117.21\", \"Router9\": \"111.24.2.102\", \"Router10\": \"221.176.21.230\", \"Router11\": \"221.183.46.253\", \"Router12\": \"221.183.30.226\", \"Router13\": \"223.120.10.137\", \"Router14\": \"223.120.14.97\", \"Router15\": \"223.120.7.50\", \"Router16\": \"223.118.11.166\", \"Router17\": \"223.118.11.150\", \"Router18\": \"198.32.242.146\", \"Router19\": \"193.0.14.129\"}, \"Path_count_ipv4\": 20, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"56\", \"DNSPod\": \"60\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"L\": {\"Identification\": \"cn-cgo-ab\", \"QueryLatency\": {\"Ipv4_udp\": \"44\", \"Ipv4_tcp\": \"44\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"199.7.83.42\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.77\", \"Router7\": \"* * *\", \"Router8\": \"221.183.55.177\", \"Router9\": \"* * *\", \"Router10\": \"* * *\", \"Router11\": \"199.7.83.42\"}, \"Path_count_ipv4\": 12, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"36\", \"114DNS\": \"48\", \"DNSPod\": \"56\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}, \"M\": {\"Identification\": \"M-NRT-JPNAP-3\", \"QueryLatency\": {\"Ipv4_udp\": \"100\", \"Ipv4_tcp\": \"100\", \"Ipv6_udp\": \"\", \"Ipv6_tcp\": \"\"}, \"Path_ipv4\": {\"Router0\": \"202.12.27.33\", \"Router1\": \"192.168.226.2\", \"Router2\": \"192.168.3.1\", \"Router3\": \"192.168.1.1\", \"Router4\": \"100.85.238.1\", \"Router5\": \"* * *\", \"Router6\": \"218.203.72.77\", \"Router7\": \"221.183.47.253\", \"Router8\": \"* * *\", \"Router9\": \"221.183.94.42\", \"Router10\": \"221.183.95.58\", \"Router11\": \"* * *\", \"Router12\": \"219.158.6.162\", \"Router13\": \"219.158.7.126\", \"Router14\": \"219.158.6.158\", \"Router15\": \"219.158.112.242\", \"Router16\": \"202.232.1.157\", \"Router17\": \"210.173.176.242\", \"Router18\": \"202.12.27.33\"}, \"Path_count_ipv4\": 19, \"Path_ipv6\": \"\", \"Path_count_ipv6\": 0, \"ReferLatency_ipv4\": {\"AliDNS\": \"32\", \"114DNS\": \"40\", \"DNSPod\": \"60\"}, \"ReferLatency_ipv6\": \"\", \"Status\": \"NXDOMAIN\", \"SourceIP_ipv4\": \"117.179.127.69\", \"SourceIP_ipv6\": \"\"}}";
		JSONObject json=JSON.parseObject(jsonString);
		System.out.println(json.toString());
	}

	@Test
	void MapperTest(){

	}

}