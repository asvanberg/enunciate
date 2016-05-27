/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webcohesion.enunciate.modules.jackson.model;

import com.webcohesion.enunciate.modules.jackson.EnunciateJacksonContext;
import com.webcohesion.enunciate.modules.jackson.model.types.JsonType;

import javax.lang.model.element.TypeElement;

/**
 * A simple type definition.
 *
 * @author Ryan Heaton
 */
public class SimpleTypeDefinition extends TypeDefinition {

  public SimpleTypeDefinition(TypeElement delegate, EnunciateJacksonContext context) {
    super(delegate, context);
  }

  public SimpleTypeDefinition(TypeDefinition copy) {
    super(copy);
  }

  /**
   * The base type for this simple type, or null if none exists.
   *
   * @return The base type for this simple type.
   */
  public JsonType getBaseType() {
    Value value = getValue();

    if (value != null) {
      return value.getJsonType();
    }

    return null;
  }

  @Override
  public boolean isSimple() {
    return true;
  }

}