/*
 * Copyright (c) 2023 Airbyte, Inc., all rights reserved.
 */

package io.airbyte.integrations.source.kafka.format;

import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.commons.util.AutoCloseableIterator;
import io.airbyte.protocol.models.v0.AirbyteMessage;
import io.airbyte.protocol.models.v0.AirbyteStream;
import java.util.List;

public interface KafkaFormat {

  boolean isAccessible();

  boolean iskafkaCheckpoint();

  List<AirbyteStream> getStreams();

  AutoCloseableIterator<AirbyteMessage> read(JsonNode var1, List<String> var2);

}
