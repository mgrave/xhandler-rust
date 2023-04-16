/*
 * Copyright 2019 Project OpenUBL, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License - 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.project.openubl.xbuilder.content.jaxb.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.math.BigDecimal;

@XmlType(name = "DebitNoteDocumentLine")
@XmlAccessorType(XmlAccessType.NONE)
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class XMLDebitNoteLine extends XMLSalesDocumentLine {
    @XmlElement(name = "DebitedQuantity", namespace = XMLConstants.CBC)
    private Quantity quantity;

    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(name = "DebitNoteDocumentLine.Quantity")
    @Data
    @NoArgsConstructor
    public static class Quantity {
        @XmlValue
        private BigDecimal value;

        @XmlAttribute(name = "unitCode")
        private String unitCode;
    }

}
