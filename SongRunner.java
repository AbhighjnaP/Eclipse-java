package com.xworkz.copy.boot;

import com.xworkz.copy.Song;

public class SongRunner {

	public static void main(String[] args) {
			
			Song Details = new Song();
			Song lang= new Song();
			Song sing= new Song();
			Song lyric=new Song();
			Song types=new Song();
			
		Details.Name="Gamanisu";
		lang.language="Kannada";
		sing.singer="Sonu nigam";
		lyric.lyricst="Jayanth kaikini";
		types.type="Sad";
		
		System.out.println(Details.Name);
		System.out.println(lang.language);
		System.out.println(sing.singer);
		System.out.println(lyric.lyricst);
		System.out.println(types.type);
		
				
	}

}
