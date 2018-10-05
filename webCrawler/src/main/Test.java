package main;

public class Test {

	public static void main(String[] args)
	{
		WebCrawler spider = new WebCrawler();
        spider.search("http://farragofiction.com/", 0, 500);
        System.out.println("Done!");
	}
}