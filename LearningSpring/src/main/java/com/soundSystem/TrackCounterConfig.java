package com.soundSystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc sgtPeppers(){
		BlankDisc cd = new BlankDisc();
		cd.setArtist("The beatles");
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		List<String> tracks = new ArrayList<>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a little help from my friends");
		tracks.add("Lucy in the sky with diamonds");
		tracks.add("Getting better");
		tracks.add("Fixing a hole");
		cd.setTracks(tracks);
		return cd;
	}
	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}

}
