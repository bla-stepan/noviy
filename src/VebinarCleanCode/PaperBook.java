package VebinarCleanCode;

public class PaperBook implements Book{
    private String name;
    private String avthor;
    private Integer sheets;
    private String coverType;

    public PaperBook(String name, String avthor, Integer sheets) {
        this.name = name;
        this.avthor = avthor;
        this.sheets = sheets;
    }

    public PaperBook(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PaperBook setName(String name) {
        this.name = name;
        return this;
    }

    public String getAvthor() {
        return avthor;
    }

    public PaperBook setAvthor(String avthor) {
        this.avthor = avthor;
        return this;
    }

    public Integer getSheets() {
        return sheets;
    }

    public PaperBook setSheets(Integer sheets) {
        this.sheets = sheets;
        return this;
    }
}
