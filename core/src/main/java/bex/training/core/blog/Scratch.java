package bex.training.core.blog;

import java.util.Date;

import com.psddev.dari.db.Query;

public class Scratch {

    public static Object main() {

        for (int i = 0; i < 100; i++) {

            String headline = "Blog Post #" + i;
            BlogPost blogPost = Query.from(BlogPost.class).where("getHeadline = ?", headline).first();
            if (blogPost == null) {
                blogPost = new BlogPost();
            }

            blogPost.setHeadline(headline);

            try {
                blogPost.save();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return new Date();
    }
}
