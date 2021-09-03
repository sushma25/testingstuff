class Main {
  static public void main( String args[] ) {
    String L="Myletter";
    String N="MyNewspaper";
    
    
    for(int i=L.length()-1;i>=0;i--)
    {
      System.out.println(L.charAt(i));
    }
    
    // M -1
    //y-1
    //e-2
    //
    Map<Character,Integer> mp = new HashMap<Character,Integer>();
    for(int i=0;i<L.length();i++)
    {
      /// l
      Character c= L.charAt(i);
      if(mp.contains(c))
      {
        int count= mp.getValue(c);
        mp.put(c,count+1);
      }
      else
      {
        mp.put(c,1);
      }
    }
    
    //print kvp in the map
    
   for(Character c in mp.getKeys())
   {
       Sytem.out.println(c+ "-" +mp.getValue(c));  
   }
      
    
    
    
    
    
    
      
    
    
    
    
    
    //System.out.println( "Hello Pramp!" );
  }
}
