/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise8;

public class BlogRepository {

	public static BlogRepository create() {
		return new BlogRepository();
	}

	public void addBlog(Blog bananaBlog) {
		throw new IllegalArgumentException("");
	}
}
