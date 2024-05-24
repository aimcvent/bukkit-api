package fr.aimcvent.bukkit.api.exception;


public class PageNotFoundException extends RuntimeException
{
    public PageNotFoundException()
    {
        super();
    }

    public PageNotFoundException(String message)
    {
        super(message);
    }

    public PageNotFoundException(Throwable throwable)
    {
        super(throwable);
    }

    public PageNotFoundException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public PageNotFoundException(
        String message,
        Throwable throwable,
        boolean fillStackTrace,
        boolean keepSuppressedException
    ) {
        super(message, throwable, fillStackTrace, keepSuppressedException);
    }
}
