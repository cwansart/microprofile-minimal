package de.openknowledge.microprofile;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("timestamp")
public class TimestampResource {

    @GET
    public String getTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
