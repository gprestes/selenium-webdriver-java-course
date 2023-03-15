package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        var currentWorkingDir = Paths.get(".").toAbsolutePath().normalize().toString();
        uploadPage.uploadFile(currentWorkingDir + "/resources/puppy_and_kitten.jpg");
        assertEquals(uploadPage.getUploadedFiles(), "puppy_and_kitten.jpg", "Uploaded files incorrect");
    }
}
