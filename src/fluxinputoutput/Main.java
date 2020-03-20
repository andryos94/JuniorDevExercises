package fluxinputoutput;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		String[] dataToRead = {"London", "Bucharest", "Berlin", "Moscow"};
		/*FileWriter f = null;
		
		try {
			f = new FileWriter("output.txt");
			
			for(String el:dataToRead) {
				f.write(el + " ");
			}
		} catch (IOException e) {
			System.out.println("something wrong has happened...");
			e.printStackTrace();
		} finally {
			try {
				if(f != null) {
					f.close();
				}
			} catch (IOException e2) {
				System.out.println("Something has happened when attempting to close the file!");
				e2.printStackTrace();
			}
		}*/
		
		try(FileWriter outputFile = new FileWriter("outputFile.txt")){
			for(String el:dataToRead) {
				outputFile.write(el + " ");
			}
		}

		//try(Scanner sc = new Scanner(new BufferedReader(new FileReader("outputFile.txt")))){
		try(BufferedReader bf = new BufferedReader(new FileReader("outputFile.txt")); FileWriter copy = new FileWriter("copy.txt")){
			bf.transferTo(copy);
		}
		///scrie pe disk abia cand iese din try{} si de aceea cand citesc "copy.txt" in acelasi try{} , imi da null
		try(BufferedReader bfCopy = new BufferedReader(new FileReader("copy.txt"))){
			System.out.println(bfCopy.readLine());
		}
		
		BufferedWriter bfWriter = null;
		try {
			bfWriter = new BufferedWriter(new FileWriter("other.txt"));
			bfWriter.write("abc");
			bfWriter.flush();
		} finally {
			bfWriter.close();
		}
		///citire si scriere in acelasi timp
		
	}

}
