package com.soundSystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
	private String title="Sgt. peppers";
	private String artist="The Beatles";

	public void play() {
		System.out.println("Playing "+title+" by "+artist);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}

}
