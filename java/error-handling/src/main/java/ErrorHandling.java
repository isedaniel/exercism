import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException("This is the detail message.");
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException("This is the detail message.");
    }

    void handleErrorByThrowingAnyCheckedException() 
            throws IOException 
    {
        throw new FileNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) 
            throws IOException 
    {
        throw new FileNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new IllegalArgumentException("This is the detail message.");
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException("This is the detail message.");
    }

    void handleErrorByThrowingCustomCheckedException() 
        throws IOException
    {
        try {
            FileReader file = new FileReader("/home/fakeFile.txt");
            file.close();
        }
        catch (FileNotFoundException e) {
            throw new CustomCheckedException();
        }
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) 
        throws IOException
    {
        try {
            FileReader file = new FileReader("/home/fakeFile.txt");
            file.close();
        }
        catch (FileNotFoundException e) {
            throw new CustomCheckedException(message);
        }
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
            return Optional.of(Integer.parseInt(integer));
        }
        catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

}
