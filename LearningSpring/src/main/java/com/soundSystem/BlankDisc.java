package com.soundSystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+"by "+artist);
		for(String track: tracks){
			System.out.println("-Track: "+track);
		}

	}

	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		System.out.println("Playing "+tracks.get(trackNumber));
	}

}
