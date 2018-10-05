package main;

public class WebCrawler
{


  /**
   * Our main launching point for the Spider's functionality. Internally it creates spider legs
   * that make an HTTP request and parse the response (the web page).
   * 
   * @param url
   *            - The starting point of the spider
   * @param searchWord
   *            - The word or string that you are searching for
   */
  public void search(String url, int startNum, int endNum)
  {

      for (int i = startNum; i <= endNum; i++)
      {
          String currentUrl;
          SpiderLeg leg = new SpiderLeg();
          currentUrl = url+i;
          leg.crawl(currentUrl);
          if(i%1024 ==0) {
        	  System.out.println(i);
          }
      }
  }
}