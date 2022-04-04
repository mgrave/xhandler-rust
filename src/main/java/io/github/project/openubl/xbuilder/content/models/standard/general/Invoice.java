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
package io.github.project.openubl.xbuilder.content.models.standard.general;

import io.github.project.openubl.xbuilder.content.models.common.Direccion;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Invoice extends Document {

    private LocalDate fechaVencimiento;
    private String tipoComprobante;

    /**
     * Catalog51
     */
    private String tipoOperacion;

    private FormaDePago formaDePago;
    private TotalImporteInvoice totalImporte;
    private Direccion direccionEntrega;
    private Detraccion detraccion;
    private Percepcion percepcion;

    /**
     * Anticipos asociados al comprobante
     */
    @Singular
    private List<Anticipo> anticipos;

    @Singular
    private List<DocumentoTributarioRelacionado_Invoice> otrosDocumentosTributariosRelacionados;
}