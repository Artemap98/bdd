import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Game game;
    int[][] gameMatrix;
    @Given("^I have my game class$")
    public void i_have_my_game_class() throws Throwable {
        this.game = new Game();
        Assert.assertNotNull(this.game);
        throw new PendingException();
    }

    @When("^I create new game$")
    public void i_create_new_game() throws Throwable {
        Assert.assertNotNull(game.CreateMatrix());
        throw new PendingException();
    }

    @Then("^I have created field with size (\\d+)x(\\d+) and empty cells$")
    public void i_have_created_field_with_size_x_and_numbers_from_to_and_one_empty_cell(int arg1, int arg2, int arg3, int arg4) throws Throwable {

        gameMatrix = game.InitMatrix(game.CreateMatrix());
        for (int i = 0; i < gameMatrix.length; i++)
        {
            for (int j = 0; j < gameMatrix[i].length; j++)
                Assert.assertEquals(0,gameMatrix[i][j]);
        }
        throw new PendingException();
    }
}
