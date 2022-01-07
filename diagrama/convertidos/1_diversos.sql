
delete from unidades;
ALTER TABLE unidades AUTO_INCREMENT = 1;
INSERT INTO unidades (descricao, status, simbolo) VALUES 
('massa (quilograma)', 'ATIVO', 'Kg'),
('comprimento (metro)', 'ATIVO', 'm'),
('tempo (segundo)', 'ATIVO', 's'),
('tempo (Hora)', 'ATIVO', 'h'),
('corrente elétrica (ampére)', 'ATIVO', 'A'),
('temperatura termodinâmica (Kelvin)', 'ATIVO', 'K'),
('área (metro quadrado)', 'ATIVO', 'm²'),
('pressão (Pascal)', 'ATIVO', 'Pa'),
('força (newton)', 'ATIVO', 'N'),
('Intensidade luminosa (Candela)', 'ATIVO', 'cd'),
('Quantidade de matéria (Mol)', 'ATIVO', 'mol'),
('velocidade (metros por segundo)', 'ATIVO', 'm/s'),
('energia (joule)', 'ATIVO', 'J'),
('tensão elétrica (volt)', 'ATIVO', 'V'),
('volume (metro cúbico)', 'ATIVO', 'm³'),
('potência (watt)', 'ATIVO', 'W'),
('unidade', 'ATIVO', 'un'),
('Conjunto', 'ATIVO', 'cj'),
('peça', 'ATIVO', 'pç'),
('Saco', 'ATIVO', 'sac'),
('Milheiro', 'ATIVO', 'mil'),
('Litros', 'ATIVO', 'l'),
('Dúzia', 'ATIVO', 'Dz'),
('Rolo', 'ATIVO', 'Rl'),
('Verba', 'ATIVO', 'vb'),
('Ponto', 'ATIVO', 'Pt'),
('Centos', 'ATIVO', 'Cent'),
('Galão', 'ATIVO', 'gal'),
('Mês', 'ATIVO', 'mes'),
('metro por mês', 'ATIVO', 'm/mes'),
('par (duas unidades)', 'ATIVO', 'par'),
('jogo (conjunto de peças vendidas juntas)', 'ATIVO', 'jg'),
('dia', 'ATIVO', 'dia'),
('saco/pacote/recipiente/embrulho de 200kg', 'ATIVO', '200kg'),
('saco/pacote/recipiente/embrulho de 50kg', 'ATIVO', '50kg'),
('saco/pacote/recipiente/embrulho de 25kg', 'ATIVO', '25kg'),
('tonelada', 'ATIVO', 'T'),
('quilowatt hora', 'ATIVO', 'kWh'),
('mililitro', 'ATIVO', 'ml'),
('grama', 'ATIVO', 'g'),
('folha', 'ATIVO', 'fl'),
('Chp', 'ATIVO', 'Chp'),
('Chi', 'ATIVO', 'Chi'),
('Chi-n', 'ATIVO', 'Chi-n'),
('Txkm', 'ATIVO', 'Txkm'),
('M³xkm', 'ATIVO', 'M³xkm'),
('Ha', 'ATIVO', 'Ha'),
('decímetro cúbico', 'ATIVO', 'dm³');



INSERT INTO `bdi_modelo` (`despesa_admin`, `iss`, `cofins`, `pis`, `cprb`, `custo_finan`, `risco_imprevisto`, `seguros`, `garantias`, `bonificacao`, `valor_final`, `codigo`, `status`) VALUES
('3,00', '5,00', '3,00', '0,65', '2,00', '0,59', '0,95', '0,40', '0,40', '6,00', '25,01', 'BDI 25%', 'ATIVO');




INSERT INTO `dados_encargos` (`jornada_mensal`, `repouso_semanal_remu`, `feriados`, `aux_enfermidade`, `licen_paternidade`, `licen_maternidade`, `faltas_justificadas`, `dias_chuva`, `aux_acidente`, `ferias`, `ano_produtivo`, `ano_produtivo_sem_horas_trab`, `salario_13`, `aviso_previo_indenizado`, `aviso_previo_trabalhado`, `ferias_indenizadas`, `despedida_injusta`, `indenizacao_adicional`, `custo_conducao`, `custo_cafe_manha`, `custo_refeicao`, `custo_seguro`, `custo_epi`, `salario_minimo`, `desligamentos`, `dispensa_injusta`, `dispensa_justa`, `espontaneos`, `fim_de_contrato_por_prazo`, `termino_de_contrato`, `aposentados`, `mortos`, `transferencias`, `estoque`, `estoque_recuperado_inicio`, `estoque_recuperado_fim`, `estoque_medio`, `dispensados_descontados`, `dispensados`, `rotatividade_descontada`, `rotatividade_nao_descontada`, `desligados_espontaneos`, `duracao_media_emprego`, `percentual_dispensa_injusta`, `num_refeicoes`, `num_conducao`, `num_ferramentas_manu`) VALUES
('220', '52', '12,50', '15,00', '5,00', '120,00', '2,00', '190', '15,00', '40,00', '365.25', '12,00', '30', '33', '7', '6,00', '0,00', '8,33', '6,25', '1,50', '7,50', '19,50', '28,80', '600,00', '72.807,00', '55380', '882', '7553', '2241', '6593', '10', '148', '0,00', '0,00', '95230,00', '102886,00', '99.058,00', '65.096,00', '72.649,00', '65,72', '73,34', '10,38', '18,26', '85,08', 24, 96, 12);






delete from mao_de_obra_modelo;
ALTER TABLE mao_de_obra_modelo AUTO_INCREMENT = 1;
INSERT INTO mao_de_obra_modelo (descricao, fk_tipo, valor_unitario, status, codigo, fk_unidade, ls_tipo) values
("Armador", null, "5,21", "ATIVO", "MAO000001", 4, 'HORISTA'),
("Carpinteiro", null, "5,21", "ATIVO", "MAO000002", 4, 'HORISTA'),
("Servente", null, "3,77", "ATIVO", "MAO000003", 4, 'HORISTA'),
("Pintor", null, "5,21", "ATIVO", "MAO000004", 4, 'HORISTA'),
("Encanador", null, "5,21", "ATIVO", "MAO000005", 4, 'HORISTA'),
("Pedreiro", null, "5,21", "ATIVO", "MAO000006", 4, 'HORISTA'),
("Ajudante", null, "3,77", "ATIVO", "MAO000007", 4, 'HORISTA'),
("Eletricista", null, "5,21", "ATIVO", "MAO000008", 4, 'HORISTA'),
("Telhadista", null, "5,21", "ATIVO", "MAO000009", 4, 'HORISTA'),
("Montador", null, "5,19", "ATIVO", "MAO000010", 4, 'HORISTA'),
("Ferreiro", null, "10,88", "ATIVO", "MAO000011", 4, 'HORISTA'),
("Motorista", null, "5,21", "ATIVO", "MAO000012", 4, 'HORISTA'),
("Auxiliar de Serralheiro", null, "7,32", "ATIVO", "MAO000013", 4, 'HORISTA'),
("Serralheiro", null, "10,88", "ATIVO", "MAO000014", 4, 'HORISTA');



INSERT INTO `encargos_horistas_modelo` (`id_encargo_horista_modelo`, `codigo`, `status`, `inss_previdencia`, `fgts`, `salario_edu`, `sesi`, `senai`, `sebrae`, `incra`, `inss_seguro`, `seconci`, `repouso_semanal`, `aux_enfermidade`, `licen_paternidade`, `salario_13`, `imprevistos`, `sem_justa_causa`, `ferias`, `aviso_previo`, `reincidencia_a_b`, `vale_transporte`, `cafe_manha`, `refeicao`, `seguro_vida`, `eq_protecao_indiv`, `ferramentas_manu`, `valor_total`, `jornada_mensal`, `repouso_semanal_remu`, `feriados`, `aux_enfermidade_dias`, `licen_paternidade_dias`, `licen_maternidade_dias`, `faltas_justificadas`, `dias_chuva`, `aux_acidente`, `ferias_dias`, `ano_produtivo`, `ano_produtivo_sem_horas_trab`, `salario_13_dias`, `aviso_previo_indenizado`, `aviso_previo_trabalhado`, `ferias_indenizadas`, `despedida_injusta`, `indenizacao_adicional`, `custo_conducao`, `custo_cafe_manha`, `custo_refeicao`, `custo_seguro`, `custo_epi`, `salario_minimo`, `desligamentos`, `dispensa_injusta`, `dispensa_justa`, `espontaneos`, `fim_de_contrato_por_prazo`, `termino_de_contrato`, `aposentados`, `mortos`, `transferencias`, `estoque`, `estoque_recuperado_inicio`, `estoque_recuperado_fim`, `estoque_medio`, `dispensados_descontados`, `dispensados`, `rotatividade_descontada`, `rotatividade_nao_descontada`, `desligados_espontaneos`, `duracao_media_emprego`, `percentual_dispensa_injusta`, `num_refeicoes`, `num_conducao`, `num_ferramentas_manu`, `val_a`, `val_b`, `val_c`, `val_d`, `val_e`) VALUES
(1, 'horista 148%', 'ATIVO', '20,00', '8,00', '2,50', '1,50', '1,00', '0,60', '0,20', '3,00', '0,00', '22,75', '0,94', '0,03', '11,16', '0,03', '5,40', '4,16', '6,18', '12,85', '6,00', '5,20', '28,50', '3,25', '4,80', '2,00', '148,05', '220', '52', '12,50', '15,00', '5,00', '120,00', '2,00', '190', '15,00', '40,00', '365,25', '12,00', '30', '33', '7', '6,00', '0,00', '8,33', '6,25', '1,50', '7,50', '19,50', '28,80', '600,00', '72.807,00', '55380', '882', '7553', '2241', '6593', '10', '148', '0,00', '0,00', '95230,00', '102886,00', '99.058,00', '65.096,00', '72.649,00', '65,72', '73,34', '10,38', '18,26', '85,08', 24, 96, 12, '36.80', '34.91', '15.74', '100.30', '47.75');


INSERT INTO `encargos_mensalistas_modelo` (`id_encargo_mensalistas_modelo`, `codigo`, `status`, `inss_previdencia`, `fgts`, `salario_edu`, `sesi`, `senai`, `sebrae`, `incra`, `inss_seguro`, `seconci`, `salario`, `sem_justa_causa`, `imprevistos`, `ferias`, `aviso_previo`, `reincidencia_a_b`, `reincidencia_a2_c3`, `vale_transporte`, `cafe_manha`, `refeicao`, `seguro_vida`, `eq_protecao_indiv`, `ferramentas_manu`, `valor_total`, `jornada_mensal`, `repouso_semanal_remu`, `feriados`, `aux_enfermidade_dias`, `licen_paternidade_dias`, `licen_maternidade_dias`, `faltas_justificadas`, `dias_chuva`, `aux_acidente`, `ferias_dias`, `ano_produtivo`, `ano_produtivo_sem_horas_trab`, `salario_13_dias`, `aviso_previo_indenizado`, `aviso_previo_trabalhado`, `ferias_indenizadas`, `despedida_injusta`, `indenizacao_adicional`, `custo_conducao`, `custo_cafe_manha`, `custo_refeicao`, `custo_seguro`, `custo_epi`, `salario_minimo`, `desligamentos`, `dispensa_injusta`, `dispensa_justa`, `espontaneos`, `fim_de_contrato_por_prazo`, `termino_de_contrato`, `aposentados`, `mortos`, `transferencias`, `estoque`, `estoque_recuperado_inicio`, `estoque_recuperado_fim`, `estoque_medio`, `dispensados_descontados`, `dispensados`, `rotatividade_descontada`, `rotatividade_nao_descontada`, `desligados_espontaneos`, `duracao_media_emprego`, `percentual_dispensa_injusta`, `num_refeicoes`, `num_conducao`, `num_ferramentas_manu`, `val_a`, `val_b`, `val_c`, `val_d`, `val_e`) VALUES
(1, 'mensalista 114%', 'ATIVO', '20,00', '8,00', '2,50', '1,50', '1,00', '0,60', '0,20', '3,00', '0,00', '11,16', '4,45', '0,03', '4,16', '6,18', '4,11', '0,49', '6,00', '5,20', '28,50', '3,25', '4,80', '2,00', '114,61', '220', '52', '12,50', '15,00', '5,00', '120,00', '2,00', '190', '15,00', '40,00', '365,25', '12,00', '30', '33', '7', '6,00', '0,00', '8,33', '6,25', '1,50', '7,50', '19,50', '28,80', '600,00', '72.807,00', '55380', '882', '7553', '2241', '6593', '10', '148', '0,00', '0,00', '95230,00', '102886,00', '99.058,00', '65.096,00', '72.649,00', '65,72', '73,34', '10,38', '18,26', '85,08', 24, 96, 12, '36.80', '11,16', '14.79', '66.86', '47.75');





