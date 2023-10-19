package javaproject;

public class DigitalMedia {
	
	public static void main(String[] args) {
		
		Ebook ebookObj = new Ebook();
		ebookObj.pageNumber = 120;
		ebookObj.price = 15;
		ebookObj.title = "Jane Austen";
		ebookObj.displayinfo();
		
		
		AudioTruck audiTruckObj = new AudioTruck();
		audiTruckObj.audioquality = "Good";
		audiTruckObj.duration = 15;
		audiTruckObj.price = 25;
		audiTruckObj.title = "Power of Decipline";
		audiTruckObj.displayinfo();
		
		videoClip videoClipObj = new videoClip();
		videoClipObj.price = 12;
		videoClipObj.resolution = "4K";
		videoClipObj.title = "Freedome Song";
		videoClipObj.displayinfo();
		
		
		
	}

}


class digitalMedias{
	
	String title;
	double price;
	
	public void displayinfo() {
		System.out.println("title of the book is :" + title + " Price of the book is $ :" + price);
	}
}

class Ebook extends digitalMedias{
	int pageNumber;
	String webAddress;
	public void displayinfo() {
		System.out.println("This book has: " + pageNumber + "and is available at: " +  webAddress);
	}
	
}

class AudioTruck extends digitalMedias{
	String audioquality;
	double duration;
	
	public void displayinfo() {
		System.out.println("The audio duratio is: " + duration + "  minutes " + "and audio quality is: " + audioquality);
	}
}

class videoClip extends digitalMedias{
	String resolution;
	public void displayinfo() {
		System.out.println("VideoClip resolution is: " + resolution);
	}
}
