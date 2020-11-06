package by.btslogistics.fklservice.service.flk.mapper;

/**
 * Преобразователь описывает только выполненение конкретной операции
 * Создан на замену трансформерам, чтобы избежать написания (объявления)
 * методов трансформирования объектов, для каждой таблицы
 *
 * @param <D> - Указывает на универсальный тип данных,
 *           который будет подразумевать объект типа <b>dto</b>
 * @param <E> - Указывает на универсальный тип данных,
 *  *           который будет подразумевать объект типа <b>entity</b>
 */
public interface CommonMapper<D, E>{

    /**
     * Преобразование объекта типа <b>entity</b>  в объект типа <b>dto</b>
     * @param e  объект-<b>entity</b
     * @return  возвращает объект типа <b>dto</b>
     */
    D toDto(E e);

    /**
     * Преобразование объекта типа   <b>dto</b> в объект типа <b>entity</b>
     * @param d - объект-<b>dto</b>
     * @return - возвращает объект типа <b>entity</b
     */
    E toEntity(D d);


    /**
     * Преобразование списка объектов типа <b>entity</b> в список объектов типа <b>dto</b>
     * @param entityList список объектов-<b>entity</b
     * @return возвращает список объектов типа <b>dto</b>
     */
    Iterable<D> toListDto(Iterable<E> entityList);

    /**
     * Преобразование списка объектов типа <b>dto</b> в список объектов типа <b>entity</b>
     * @param dtoList список объектов-<b>dto</b
     * @return возвращает список объектов типа <b>entity</b>
     */
    Iterable<E> toListEntity(Iterable<D> dtoList);
}
