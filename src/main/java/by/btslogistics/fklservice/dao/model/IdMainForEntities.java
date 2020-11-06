package by.btslogistics.fklservice.dao.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * Данный класс содержит поле ID, которое будет использоваться во всех
 * сущностях, которые будут населодоваться от данного классса.
 * Данное поле, будет первичным ключом во всех сущностях, наследуемых данный
 * класс.
 * hibernate генерирует строку, используя  128-bit алгоритм шифрования (получается
 * строка 32 символа)
 */
@MappedSuperclass
public abstract class IdMainForEntities {

    @Id
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @GeneratedValue(generator="system-uuid")
    @Column(name = "id", nullable = false)
    private String id;

    public IdMainForEntities() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdMainForEntities that = (IdMainForEntities) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "IdMainForEntities{" +
                "id='" + id + '\'' +
                '}';
    }
}
