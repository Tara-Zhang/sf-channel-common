/*
 * Copyright 2019 Sensors Data Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sensorsdata.focus.channel.msg.body.sample;

import lombok.Data;

import java.util.Map;

/**
 * Webhook 消息体
 *
 * @version 1.0.0
 * @since 2020/06/22 16:05
 */
@Data
public class WebHookMsg {
  /**
   * webhook 发送 id
   */
  private String sendId;
  /**
   * webhook 请求参数
   */
  private Map<String, String> parameters;
}
