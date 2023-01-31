package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsertDto {

    private String title;
    private String textLine;

    public InsertDto(String title, String textLine) {
        this.title = title;
        this.textLine = textLine;
    }
}
