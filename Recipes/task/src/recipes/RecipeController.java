package recipes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecipeController {
    private Recipe myRecipe;

    @GetMapping(path = "/api/recipe")
    public ResponseEntity<Recipe> getRecipe() {
        return new ResponseEntity<>(this.myRecipe, HttpStatus.OK);
    }

    @PostMapping(path = "/api/recipe")
    public void postRecipe(@RequestBody Recipe recipe) {
        this.myRecipe = recipe;
    }
}
