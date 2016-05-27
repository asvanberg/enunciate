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

/**
 * The "data" package contains genealogical data.
 */
@XmlSchema (
  namespace = "http://enunciate.webcohesion.com/samples/genealogy/data",
  elementFormDefault = XmlNsForm.QUALIFIED
)
@XmlJavaTypeAdapters (
  {@XmlJavaTypeAdapter ( value = DateTimeXmlAdapter.class, type = DateTime.class)}
)
package com.webcohesion.enunciate.examples.jaxwsrijersey.genealogy.data;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;