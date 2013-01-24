package microejb;


public class WrappedField {
    String fieldname;
    Class clazz;
    String annotation;

    @Override
    public String toString() {
        return "WrappedField{" +
                "fieldname='" + fieldname + '\'' +
                ", clazz=" + clazz +
                ", annotation='" + annotation + '\'' +
                '}';
    }

    public WrappedField(String fieldname, Class clazz, String annotation) {
        this.fieldname = fieldname;
        this.clazz = clazz;
        this.annotation = annotation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrappedField that = (WrappedField) o;

        if (annotation != null ? !annotation.equals(that.annotation) : that.annotation != null) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        if (fieldname != null ? !fieldname.equals(that.fieldname) : that.fieldname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fieldname != null ? fieldname.hashCode() : 0;
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
        return result;
    }
}
