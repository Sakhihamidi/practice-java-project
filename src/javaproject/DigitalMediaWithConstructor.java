package javaproject;

public class DigitalMediaWithConstructor {
		
		public static void main(String[] args) {
			
			Ebook1 ebookObj = new Ebook1(120, "Jane Austen");
			ebookObj.displayinfo();
			
			AudioTruck1 audiTruckObj = new AudioTruck1("Power of Decipline", 12);
			audiTruckObj.displayinfo();
			
			videoClip1 videoClipObj = new videoClip1("Freedome Song");
			videoClipObj.displayinfo();
		}
	}


	class digitalMedias1{
		
		String title;
		double price;
		
		
		public digitalMedias1(String title, double price) {
			super();
			this.title = title;
			this.price = price;
		}

		public void displayinfo() {
			System.out.println("title of the book is :" + title + " Price of the book is $ :" + price);
		}
	}

	
	
	class Ebook1 extends digitalMedias{
		int pageNumber;
		String webAddress;
		
		public Ebook1(int pageNumber, String webAddress) {
			super();
			this.pageNumber = pageNumber;
			this.webAddress = webAddress;
		}

		public void displayinfo() {
			System.out.println("This book has: " + pageNumber + "and is available at: " +  webAddress);
		}
		
	}

	class AudioTruck1 extends digitalMedias{
		String audioquality;
		double duration;
				
		public AudioTruck1(String audioquality, double duration) {
			super();
			this.audioquality = audioquality;
			this.duration = duration;
		}


		public void displayinfo() {
			System.out.println("The audio duratio is: " + duration + "  minutes " + "and audio quality is: " + audioquality);
		}
	}

	class videoClip1 extends digitalMedias{
		String resolution;
		
		public videoClip1(String resolution) {
			super();
			this.resolution = resolution;
		}


		public void displayinfo() {
			System.out.println("VideoClip resolution is: " + resolution);
		}
	}



