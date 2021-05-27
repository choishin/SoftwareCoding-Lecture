package k40_FileWriter_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter k40_fw = new FileWriter(
				"C:\\Users\\chois\\Downloads\\한국전력공사_시군구별 용도업종별 전력사용량_20170504.csv");
		BufferedWriter k40_bw = new BufferedWriter(k40_fw);
		StringBuffer k40_sf=new StringBuffer();
		BufferedReader k40_br = new BufferedReader(new InputStreamReader(System.in));
		String k40_str = "";
		while(!(k40_str = k40_br.readLine()).startsWith("s"))
			k40_sf.append(k40_str+ "Wn ");
		k40_br.close();
		k40_fw.write(k40_sf.toString()) ;
		k40_fw.flush();
		k40_fw.close();
		System.out.println("저장이 완료되었습니다.");

	}

}
