import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Absolute {
    private static final String PATH = System.getProperty("user.dir") + "\\Logs_Course A_StudentsActivities.xlsx";

    public Map<Integer, Integer> absoluteFrequency() {
        Match match = new Match();
        Map<Integer, Integer> users = new TreeMap<>();

        try (FileInputStream inputStream = new FileInputStream(PATH);
             Workbook workbook = new XSSFWorkbook(inputStream)) {
            Sheet firstSheet = workbook.getSheetAt(0);

            List<String> data = new ArrayList<>();

            for (Row nextRow : firstSheet) {
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    data.add(cell.getStringCellValue());
                }
                if (data.get(1).contains("Лекция")) {
                    int id = match.findID(data.get(4));
                    if(users.containsKey(id)) {
                        users.computeIfPresent(id, (k, v) -> v + 1);
                    }else {
                        users.put(id, 1);
                    }
                }
                data.clear();
            }
        } catch (IOException e) {
            System.out.println("Wrong file!");
        }
        return users;
    }
}
