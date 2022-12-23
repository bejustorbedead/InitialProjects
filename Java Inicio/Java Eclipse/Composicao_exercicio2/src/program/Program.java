package program;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Comment c1 = new Comment("Have a nice trip! ");
		Comment c2 = new Comment("Wow, thats awesome! ");
		Post p1 = new Post("Traveling to NewZealand", "I'm going to visit this wonderful country", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	
	}
}
