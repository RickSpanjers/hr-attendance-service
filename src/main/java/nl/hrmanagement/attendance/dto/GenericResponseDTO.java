package nl.hrmanagement.attendance.dto;

public class GenericResponseDTO {
    private boolean success;
    private Object data;
    private String message;

    public GenericResponseDTO() {
    }

    public GenericResponseDTO(boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
