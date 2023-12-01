import Exceptions.EatedNotEnoughException;

public interface ICanDo {
    public void toDo(Baby object, Interaction activity) throws EatedNotEnoughException;
}
