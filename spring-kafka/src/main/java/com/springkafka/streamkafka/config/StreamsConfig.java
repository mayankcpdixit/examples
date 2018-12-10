package com.springkafka.streamkafka.config;
import com.springkafka.streamkafka.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;
@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
