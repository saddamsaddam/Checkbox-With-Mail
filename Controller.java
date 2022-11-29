// Annotation
    @RequestMapping(value = "/submit",
                    method = RequestMethod.POST)
  
    // Method
    public String
    submit(@RequestParam("email") String framework,Model m) throws IOException
    {
    	String[] id=new String[100] ;
    	Arrays.fill(id, "");
    	int c=0;
    	for(int i=0;i<framework.length();i++)
    	{
    		if(framework.charAt(i)==',')
    		{
    			c++;
    		}
    		else
    		{
    		id[c]=id[c]+framework.charAt(i);	
    		}
    	}
    	
    	
    	
    	
    	for(int i=0;i<=c;i++)
    	{
    		gmail.Send("ce18046@mbstu.ac.bd", id[i], "jntoksxrgooavnuq");
    		System.out.print("Massage Sent "+id[i]+"\n");
    	}
    	
    	m.addAttribute("length", c);
    	m.addAttribute("data", id);
    	return "admin/AssignmentViewResultPage";
    
    }
	
	
	
