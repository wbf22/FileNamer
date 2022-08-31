import org.junit.jupiter.api.Test;

import java.io.File;

public class FileNamer {


    @Test
    public void rename() {
        renameFilesInDirectory(1180, "C:\\Users\\brand\\Desktop\\images");
    }


    private void renameFilesInDirectory(int startingNumber, String folder_path) {

        // creating new folder
        File myfolder = new File(folder_path);

        File[] file_array = myfolder.listFiles();

        int cnt = startingNumber;

        for (File file : file_array) {

            if (file.isFile()) {

                File myfile = new File(folder_path + "\\" + file.getName());
                String long_file_name = file.getName();
                String[] tokens = long_file_name.split("\\.");
                myfile.renameTo(new File(folder_path + "\\" + cnt + "." + tokens[1]));
                cnt++;
            }
        }
    }

}
