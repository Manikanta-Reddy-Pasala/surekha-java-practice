package com.learning.fileReadingAndWriting;

//every opened file needs to be closed at the end, hence we can write this method
class CloseFile implements AutoCloseable { // interface AutoCloseable contains default close method, we can override
    // if needed

    @Override
    public void close() throws Exception {
        System.out.println("closing");

    }
}

public class TryWithResources {
    public static void main(String[] args) {

        /*  CloseFile cf = new CloseFile();
                  try {
                       cf.close();
                     } catch (Exception e) {
                        e.printStackTrace();
                     }
         */
        //or we can also write this like

        try(CloseFile cf = new CloseFile()){ // this is called try with resources

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
