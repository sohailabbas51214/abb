import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BlogController {
    
    @PostMapping("/comment")
    public String addComment(@RequestBody String comment) {
        // Here, you would save the comment to a database
        return "Comment received: " + comment;
    }
}
