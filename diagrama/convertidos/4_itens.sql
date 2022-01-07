delete from itens_modelo;
ALTER TABLE itens_modelo AUTO_INCREMENT = 1;
delete from item_modelo_x_material_modelo;
ALTER TABLE item_modelo_x_material_modelo AUTO_INCREMENT = 1;
delete from item_modelo_x_mao_obra_modelo;
ALTER TABLE item_modelo_x_mao_obra_modelo AUTO_INCREMENT = 1;
delete from item_modelo_x_equipamento_modelo;
ALTER TABLE item_modelo_x_equipamento_modelo AUTO_INCREMENT = 1;


-- arquivo 1.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('1', 'ITM000001', 'Muro de fechamento h=1,80m', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '1', '0,0040');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '2', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '3', '0,0600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '4', '0,0700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '5', '0,0700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '6', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '12215', '1,1000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('1', '2', '1,1000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('1', '6', '1,5562');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('1', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='69,94' WHERE id_item_modelo=1;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('2', 'ITM000002', 'Adaptador de pvc rigido soldável curto c/ bolsa e rosca p/registro diam=25mm x 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('2', '7', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('2', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('2', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='9,46' WHERE id_item_modelo=2;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('3', 'ITM000003', 'Adaptador de pvc rigido soldável curto c/ bolsa e rosca p/ registro diam=2mm x 1/2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('3', '8', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('3', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('3', '15778', '3,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('3', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='35,22' WHERE id_item_modelo=3;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('4', 'ITM000004', 'Registro gaveta bruto,dn 40 mm (1 1/2)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('4', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('4', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='2,88' WHERE id_item_modelo=4;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('5', 'ITM000005', 'Registro gaveta bruto,dn 50 mm (2)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('5', '10', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('5', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('5', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='62,54' WHERE id_item_modelo=5;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('6', 'ITM000006', 'Registro gaveta bruto,dn 60 mm (2 1/2)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('6', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('6', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='2,88' WHERE id_item_modelo=6;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('7', 'ITM000007', 'Registro gaveta c/ canopla cromada,dn 20 mm (3/4)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('7', '12', '0,6000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('7', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('7', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='38,95' WHERE id_item_modelo=7;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('8', 'ITM000008', 'Registro gaveta c/ canopla cromada,dn 25 mm (1)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('8', '13', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('8', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('8', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='45,30' WHERE id_item_modelo=8;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('9', 'ITM000009', 'Registro gaveta c/canopla cromada,dn 32 mm (1 1/4)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('9', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('9', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='2,88' WHERE id_item_modelo=9;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('10', 'ITM000010', 'Registro pressão c/ canopla cromada,dn 20mm (3/4)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('10', '15', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('10', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('10', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='38,95' WHERE id_item_modelo=10;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('11', 'ITM000011', 'Caixa de gordura em alvenaria (90 x 90 x 120 cm)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('11', '16', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('11', '6', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('11', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='106,01' WHERE id_item_modelo=11;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('12', 'ITM000012', 'Caixa de inspeção em alvenaria (90 x 90 x 120 cm)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('12', '17', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('12', '15253', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('12', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='218,80' WHERE id_item_modelo=12;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('13', 'ITM000013', 'Bacia sanitaria convencional,inclusive assento,conjunto de fixação,anel de vedação,tubo de ligação com acabamento cromado e engate plástico', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('13', '18', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('13', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('13', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='153,45' WHERE id_item_modelo=13;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('14', 'ITM000014', 'Bacia sanitaria com caixa de descarga acoplada,inclusive assento,conjunto de fixação,anel de vedação,tubo de ligação e engatr plástico,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('14', '19', '1,1000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('14', '5', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('14', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='200,59' WHERE id_item_modelo=14;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('15', 'ITM000015', 'Lavatório com coluna,com sifão plástico,engate plástico torneira de metal,válvula cromada,conjunto de fixação,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('15', '20', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('15', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('15', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='289,53' WHERE id_item_modelo=15;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('16', 'ITM000016', 'Lavatório sem coluna,com sifão plástico,engate plástico torneira de metal,válvula cromada,conjunto de fixação,conforme especificações,para pne', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('16', '21', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('16', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('16', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='101,34' WHERE id_item_modelo=16;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('17', 'ITM000017', 'Cuba de sobrepor oval,p/ instalação em bancadas,c/ sifão cromado,torneira de metal,engate plástico conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('17', '22', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('17', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('17', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='249,16' WHERE id_item_modelo=17;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('18', 'ITM000018', 'Tanque de louça com coluna,com torneira metálica,c/ válvula de plástico e conjunto de fixação,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('18', '23', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('18', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('18', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='224,29' WHERE id_item_modelo=18;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('19', 'ITM000019', 'Papeleira de louça,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '24', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('19', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '15778', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '25', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '26', '0,2750');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '27', '0,2400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '29', '0,7920');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('19', '2', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('19', '15778', '0,2250');
UPDATE itens_modelo SET valor_unitario='30,24' WHERE id_item_modelo=19;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('20', 'ITM000020', 'Cabide de louça,branco,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('20', '30', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('20', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('20', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='16,78' WHERE id_item_modelo=20;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('21', 'ITM000021', 'Chuveiro elétrico de plástico', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('21', '31', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('21', '13758', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('21', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='27,44' WHERE id_item_modelo=21;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('22', 'ITM000022', 'Torneira cromada para pia de cozinha,de mesa,com articulador,ø 1/2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('22', '32', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('22', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('22', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='86,32' WHERE id_item_modelo=22;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('23', 'ITM000023', 'Válvula de descarga cromada', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('23', '33', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('23', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('23', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='144,80' WHERE id_item_modelo=23;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('24', 'ITM000024', 'Fornecimento e instalação saboneteira de louça,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('24', '34', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('24', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('24', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='18,92' WHERE id_item_modelo=24;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('25', 'ITM000025', 'Cuba inox de embutir,em bancada', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('25', '35', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('25', '5', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('25', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='133,48' WHERE id_item_modelo=25;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('26', 'ITM000026', 'Barra de apoio para deficiente em ferro galvanizado de 11/2,1 = 80 cm (bacia sanitária e mictório),inclusive parafusos de fixação e pintura', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('26', '36', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('26', '15253', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('26', '15778', '0,2500');
UPDATE itens_modelo SET valor_unitario='171,64' WHERE id_item_modelo=26;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('27', 'ITM000027', 'Barra de apoio para deficiente em ferro galvanizado de 11/2,1 = 40 cm lavatório),inclusive parafuso de fixaçãi e pintura', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('27', '37', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('27', '15253', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('27', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='300,50' WHERE id_item_modelo=27;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('28', 'ITM000028', 'Fio isolado em pvc seção 1,5mm² - 750v / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('28', '38', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('28', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('28', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='1,68' WHERE id_item_modelo=28;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('29', 'ITM000029', 'Fio isolado em pvc seção 2,5mm² - 750v / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('29', '39', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('29', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('29', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='2,45' WHERE id_item_modelo=29;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('30', 'ITM000030', 'Fio isolado em pvc seção 4,0mm² - 750v / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('30', '40', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('30', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('30', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='2,45' WHERE id_item_modelo=30;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('31', 'ITM000031', 'Fio isolado em pvc seção 6,0mm² - 750v / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('31', '41', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('31', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('31', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='2,97' WHERE id_item_modelo=31;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('32', 'ITM000032', 'Cabo isolado em pvc seção 10,0mm² - 750v / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('32', '42', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('32', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('32', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='5,54' WHERE id_item_modelo=32;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('33', 'ITM000033', 'Cabo isolado em pvc 16,0mm² - 750 / 70º c', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('33', '43', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('33', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('33', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='77,73' WHERE id_item_modelo=33;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('34', 'ITM000034', 'Interruptor 01 seção simples', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('34', '44', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('34', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('34', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='5,06' WHERE id_item_modelo=34;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('35', 'ITM000035', 'Interruptor 02 seções simples', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('35', '45', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('35', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('35', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='6,79' WHERE id_item_modelo=35;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('36', 'ITM000036', 'Interruptor para ventilador', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('36', '46', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('36', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('36', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='5,06' WHERE id_item_modelo=36;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('37', 'ITM000037', 'Tomada para telefone,com caixa pvc,embutida', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('37', '47', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('37', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('37', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='9,03' WHERE id_item_modelo=37;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('38', 'ITM000038', 'Tomadas de embutir para uso geral,2p+t', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('38', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('38', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='0,65' WHERE id_item_modelo=38;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('39', 'ITM000039', 'Tomadas de embutir para uso geral,2p+t dupla', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('39', '49', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('39', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('39', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='6,79' WHERE id_item_modelo=39;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('40', 'ITM000040', 'Disjuntor termomagnético tripolar 63 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('40', '50', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('40', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('40', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='69,27' WHERE id_item_modelo=40;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('41', 'ITM000041', 'Disjuntor termomagnético monopolar 16', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('41', '51', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('41', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('41', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='8,01' WHERE id_item_modelo=41;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('42', 'ITM000042', 'Disjuntor termomagnetico monopolar 20 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('42', '52', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('42', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('42', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='8,01' WHERE id_item_modelo=42;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('43', 'ITM000043', 'Disjuntor termomagnetico tripolar 32 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('43', '53', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('43', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('43', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='49,04' WHERE id_item_modelo=43;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('44', 'ITM000044', 'Disjuntor termomagnetico tripolar 40 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('44', '54', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('44', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('44', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='49,04' WHERE id_item_modelo=44;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('45', 'ITM000045', 'Disjuntor termomagnetico monopolar 16 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('45', '55', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('45', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('45', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='8,01' WHERE id_item_modelo=45;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('46', 'ITM000046', 'Disjuntor termomagnetico tripolar 32 a, padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('46', '56', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('46', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('46', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='49,04' WHERE id_item_modelo=46;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('47', 'ITM000047', 'Disjuntor termonagnetico monopolar 25 a,padrão din (linha branca)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('47', '57', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('47', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('47', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='8,01' WHERE id_item_modelo=47;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('48', 'ITM000048', 'Distribuidor geral padrão telebrás dimensões 0,20 x 0,20 x 0,12m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('48', '58', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('48', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('48', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='62,63' WHERE id_item_modelo=48;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('49', 'ITM000049', 'Luminárias fluorescente de embutir aberta 1 x 32 w,completa conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('49', '59', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('49', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('49', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='47,74' WHERE id_item_modelo=49;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('50', 'ITM000050', 'Luminárias fluorescente de embutir aberta 2 x 32 w,completa conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('50', '60', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('50', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('50', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='67,46' WHERE id_item_modelo=50;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('51', 'ITM000051', 'Cabo de cobre nú 35 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('51', '61', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('51', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('51', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='14,55' WHERE id_item_modelo=51;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('52', 'ITM000052', 'Conjunto terminal aéreo,presila e fixação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('52', '62', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('52', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('52', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='13,61' WHERE id_item_modelo=52;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('53', 'ITM000053', 'Conector e descida para pilares', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('53', '63', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('53', '13758', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('53', '15778', '0,0300');
UPDATE itens_modelo SET valor_unitario='5,90' WHERE id_item_modelo=53;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('54', 'ITM000054', 'Porta em madeira de lei,lisa,semi-ôca,0.70 x 2.10 m,exclusive e ferragens - pm - 1', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('54', '64', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('54', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='334,60' WHERE id_item_modelo=54;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('55', 'ITM000055', 'Porta em madeira de lei,lisa,semi-ôca,0.80 x 2.10 m,exclusive e ferragens - pm - 2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('55', '65', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('55', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='544,49' WHERE id_item_modelo=55;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('56', 'ITM000056', 'Porta em madeira de lei,lisa,semi-ôca,0.90 x 2.10 m,exclusive e ferragens - pm - 3', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('56', '66', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('56', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='544,49' WHERE id_item_modelo=56;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('57', 'ITM000057', 'Porta em madeira de lei,lisa,semi-ôca,0.60 x 1.80 m,exclusive e ferragens - pm - 4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('57', '67', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('57', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='310,93' WHERE id_item_modelo=57;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('58', 'ITM000058', 'Porta em madeira de lei,lisa,semi-ôca,0.80 x 1.80 m,exclusive e ferragens - pm - 5', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('58', '68', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('58', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='310,93' WHERE id_item_modelo=58;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('59', 'ITM000059', 'Basculante de ferro (dimensão,detalhes e nos ambientes conforme o projeto - vide quadro de esquadrias)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('59', '69', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('59', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='314,11' WHERE id_item_modelo=59;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('60', 'ITM000060', 'Fechadura,maçaneta/espelho,acabamento cromado brilhante,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('60', '70', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('60', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='89,30' WHERE id_item_modelo=60;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('61', 'ITM000061', 'Dobradiça de latão ou aço,acabamento cromado brilhante,tipo média,3 x 2 1/2 especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('61', '71', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('61', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='8,25' WHERE id_item_modelo=61;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('62', 'ITM000062', 'Tarjeta em aço inox para banheiro (tipo livre/ocupado)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('62', '72', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('62', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='22,06' WHERE id_item_modelo=62;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('63', 'ITM000063', 'Telhado em telha cerâmica tipo plan de primeira qualidade', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('63', '73', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('63', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('63', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='36,03' WHERE id_item_modelo=63;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('64', 'ITM000064', 'Estrutura para telha cerâmica tipo plan,em madeira de lei aparelahada', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('64', '74', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('64', '241', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('64', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='37,14' WHERE id_item_modelo=64;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('65', 'ITM000065', 'Chapisco em parede com argamassa traço - 1:3 (cimento/areia)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('65', '75', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('65', '6', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('65', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='2,59' WHERE id_item_modelo=65;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('66', 'ITM000066', 'Chapisco em teto com argamassa traço - 1:3 (cimento/areia)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('66', '76', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('66', '6', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('66', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='2,59' WHERE id_item_modelo=66;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('67', 'ITM000067', 'Emboço de parede,com argamassa traço - 1:2:6 (cimento/cal/areia),espessura 2,0 cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('67', '77', '1,0500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('67', '6', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('67', '15778', '0,2500');
UPDATE itens_modelo SET valor_unitario='14,45' WHERE id_item_modelo=67;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('68', 'ITM000068', 'Emboço de parede,com argamassa traço - 1:2:8 (cimento/cal/areia),espessura 1,5 cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('68', '78', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('68', '15253', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('68', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='11,70' WHERE id_item_modelo=68;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('69', 'ITM000069', 'Emboço de parede,com argamassa traço - 1:2:6 (cimento/cal/areia),espessura 1,5 cm - massa única', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('69', '79', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('69', '15253', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('69', '15778', '0,4600');
UPDATE itens_modelo SET valor_unitario='18,77' WHERE id_item_modelo=69;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('70', 'ITM000070', 'Revestimento cerâmico para parede,pei-4,dimensões 10 x 10 cm,aplicado com argamassa indrustrializada ac-i,rejuntad,exclusive emboço,conforme especificações', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('70', '80', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('70', '15253', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('70', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='55,34' WHERE id_item_modelo=70;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('71', 'ITM000071', 'Lastro de concreto simples regularizado para piso inclusive impermeabilização', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('71', '81', '0,0376');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('71', '15253', '0,3200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('71', '15778', '0,1180');
UPDATE itens_modelo SET valor_unitario='14,71' WHERE id_item_modelo=71;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('72', 'ITM000072', 'Revestimento cerâmico para piso,dimensões 40 x 40 cm,pei - 4,aplicado com argamassa industrializada ac-i,rejuntado,exclusive regularização de base,conforme especificações', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('72', '82', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('72', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('72', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='36,92' WHERE id_item_modelo=72;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('73', 'ITM000073', 'Piso em concreto simples desempolado,fck=15 mpa,e= 7 cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('73', '83', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('73', '15253', '0,3200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('73', '15778', '0,1180');
UPDATE itens_modelo SET valor_unitario='27,83' WHERE id_item_modelo=73;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('74', 'ITM000074', 'Soleira em granito cinza andorinha largura 15 cm espessura 3 cm,inclusive impermeabilização', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('74', '84', '1,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('74', '15253', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('74', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='41,17' WHERE id_item_modelo=74;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('75', 'ITM000075', 'Rodapé cerâmico,dimensões 8.5 x 40 cm,aplicado com argamassa industrializada ac-i,rejuntado,conforme especificações', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('75', '85', '1,0600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('75', '15253', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('75', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='6,27' WHERE id_item_modelo=75;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('76', 'ITM000076', 'Pintura sobre parede,com lixamento,aplicação de 01 demão de selador acrílico,02 demãos de massa acrílica e 02 demãos de tinta acrílica', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('76', '86', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('76', '15300', '0,1800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('76', '15778', '0,1800');
UPDATE itens_modelo SET valor_unitario='9,12' WHERE id_item_modelo=76;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('77', 'ITM000077', 'Pintura sobre teto,com lixamento,aplicação de 01 demão de selador acrílico,02 demãos de massa acrílica 02 demãos de tinta acrílica', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('77', '15300', '0,1800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('77', '15778', '0,1800');
UPDATE itens_modelo SET valor_unitario='3,94' WHERE id_item_modelo=77;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('78', 'ITM000078', 'Pintura de acabamento com aplicação de 02 demãos de esmalte sobre esquadrias de madeira', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('78', '88', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('78', '15300', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('78', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='7,24' WHERE id_item_modelo=78;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('79', 'ITM000079', 'Pintura de acabamento com aplicação de 01 demão de esmalte sintético sobre madeiramento do telhado', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('79', '89', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('79', '15300', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('79', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='7,24' WHERE id_item_modelo=79;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('80', 'ITM000080', 'Pintura sobre esquadrias metálicas ,com aplicação de 01 demão de tinta a base de zarcão e 02 demãos de tinta esmalte', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('80', '90', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('80', '15300', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('80', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='14,88' WHERE id_item_modelo=80;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('81', 'ITM000081', 'Banco de concreto em alvenaria de tijolos,assento em concreto armado,sem encosto,pintado com tinta acrilica,2 demãos (dimensões,detalhes e nos ambientes conforme especificações', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('81', '91', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('81', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('81', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='116,89' WHERE id_item_modelo=81;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('82', 'ITM000082', 'Bancada em granito cinza andorinha de 3cm de espessuar,dim 2.85 x 0.60 m,com testeira 7 cm,com instalação de 3 cubas (ver item 5.10.5) e um corte circular,polido,para lixeira conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('82', '92', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('82', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('82', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='1.149,35' WHERE id_item_modelo=82;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('83', 'ITM000083', 'Bancada em granito cinza andorinha de 3cm espessura,dim 3.65 x 0.60m,inclusive rodopia 7 cm,assentada', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('83', '93', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('83', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('83', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='1.149,35' WHERE id_item_modelo=83;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('84', 'ITM000084', 'Bancada em granito cinza andorinha de 3 cm de espessura,dim 3.65 x 0.60m,com duas cubas de cozinha,inclusive rodopia 7 cm,e pingadeira 2 cm assentada', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('84', '94', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('84', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('84', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='1.149,35' WHERE id_item_modelo=84;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('85', 'ITM000085', 'Bancada em alvenaria com portas em madeira com revestimento melamínico,tampo em granito cinza andorinha,conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('85', '95', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('85', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('85', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='318,82' WHERE id_item_modelo=85;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('86', 'ITM000086', 'Bancada com tampo de madeira com revestimento melamínico branco (dim 0.80 x 6.00m) e base em alvenaria revestida em cerâmica,conforme especificações', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('86', '96', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('86', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('86', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='213,57' WHERE id_item_modelo=86;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('87', 'ITM000087', 'Quadro escolar verde e branco,com moldura de madeira e porta giz e pincel atômico,conforme especificações', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('87', '97', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('87', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('87', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='132,24' WHERE id_item_modelo=87;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('88', 'ITM000088', 'Quadro escolar branco,com moldura,instalado na sala de informática', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('88', '98', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('88', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('88', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='134,39' WHERE id_item_modelo=88;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('89', 'ITM000089', 'Prateleira em compensado naval,18 mm,com revestimento melamínico,inclusive suporte com mão francesa,conforme projeto', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('89', '99', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('89', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('89', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='74,85' WHERE id_item_modelo=89;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('90', 'ITM000090', 'Extintor de pó quimico abc,capacidade 6 kg,alcance médio do jato 5 m,tempo de descarga 16s,nbr 9443,9444,10721', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('90', '100', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('90', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('90', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='500,54' WHERE id_item_modelo=90;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('91', 'ITM000091', 'Tubo de aço sem costura sch 40 ø 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('91', '101', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('91', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('91', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='17,56' WHERE id_item_modelo=91;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('92', 'ITM000092', 'Cotovelo em aço forjado classe 10 ø 3/4 x 90º', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('92', '102', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('92', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('92', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='20,61' WHERE id_item_modelo=92;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('93', 'ITM000093', 'Te em aço forjado classe 10 ø 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('93', '103', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('93', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('93', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='28,90' WHERE id_item_modelo=93;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('94', 'ITM000094', 'União em aço forjado classe 10 ø 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('94', '104', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('94', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('94', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='51,39' WHERE id_item_modelo=94;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('95', 'ITM000095', 'Registro esfera ø 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('95', '105', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('95', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('95', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='92,33' WHERE id_item_modelo=95;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('96', 'ITM000096', 'Luva em aço forjado classe 10 ø 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('96', '106', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('96', '15253', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('96', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='11,58' WHERE id_item_modelo=96;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('97', 'ITM000097', 'Vidro liso incolor 4mm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('97', '107', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('97', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='53,48' WHERE id_item_modelo=97;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('98', 'ITM000098', 'Vidro canelado incolor 4mm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('98', '108', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('98', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='39,13' WHERE id_item_modelo=98;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('99', 'ITM000099', 'Espelho de cristal 4mm,com moldura de aluminio,acabamento em laminado', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('99', '109', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('99', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='228,67' WHERE id_item_modelo=99;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('100', 'ITM000100', 'Cabo telefonico cci-50 2 pares(uso interno) - fornecimento e instalação', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('100', '110', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('100', '13758', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('100', '15778', '0,0050');
UPDATE itens_modelo SET valor_unitario='0,70' WHERE id_item_modelo=100;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('101', 'ITM000101', 'Cabo utp 4 pares categoria 6', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('101', '111', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('101', '13758', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('101', '15778', '0,0050');
UPDATE itens_modelo SET valor_unitario='2,56' WHERE id_item_modelo=101;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('102', 'ITM000102', 'Obturador com haste padão telebras', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('102', '112', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('102', '13758', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('102', '15778', '0,0050');
UPDATE itens_modelo SET valor_unitario='10,11' WHERE id_item_modelo=102;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('103', 'ITM000103', 'Quadro de distribuição para telefone n.3,40 x 40 x 12 cm sem chapa metálica,sem acessórios,padrão telebras,fornecimento e instalação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('103', '113', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('103', '13758', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('103', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='126,95' WHERE id_item_modelo=103;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('104', 'ITM000104', 'Conector rj45 (fêmea),para lógica', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('104', '114', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('104', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('104', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='9,62' WHERE id_item_modelo=104;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('105', 'ITM000105', 'Espelho plástico rj11/rj45 2 x 4,2 saidas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('105', '115', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('105', '13758', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('105', '15778', '0,0050');
UPDATE itens_modelo SET valor_unitario='4,72' WHERE id_item_modelo=105;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('106', 'ITM000106', 'Tomada para telefone de 4 pólos padrão telebrás - fornecimento e instalação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('106', '116', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('106', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('106', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='9,01' WHERE id_item_modelo=106;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('107', 'ITM000107', 'Muro em cobogó h=1,80m, - padrão fnde', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('107', '117', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('107', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('107', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='92,29' WHERE id_item_modelo=107;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('108', 'ITM000108', 'Portão de abrir em metalon 40 x 40mm c/ 10 cm 2 fls', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('108', '118', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('108', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('108', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='450,13' WHERE id_item_modelo=108;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('109', 'ITM000109', 'Tirante com rosca total,ref. dp - 48,ø 1 1/4 x 600mm,fabricação real perfil ou similar', '0,00', '19', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('109', '13758', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('109', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='2,37' WHERE id_item_modelo=109;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('110', 'ITM000110', 'Estrutura para telha cerâmica tipim plan,em madeira aparelhada,apoiada em parede', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('110', '120', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('110', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='25,14' WHERE id_item_modelo=110;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('111', 'ITM000111', 'Cobertura em telha cerâmica tipo plan com argamassa traço 1:3 (cimento e areia) e arame recozido', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('111', '121', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('111', '6', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('111', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='30,87' WHERE id_item_modelo=111;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('112', 'ITM000112', 'Cumeeira com telha cerâmica tipo plan embocada com argamassa traço 1:2:8 (cimento,cal hidratada e areia)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('112', '122', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('112', '6', '0,1440');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('112', '15778', '0,1440');
UPDATE itens_modelo SET valor_unitario='8,31' WHERE id_item_modelo=112;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('113', 'ITM000113', 'Limpeza geral', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('113', '123', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('113', '15778', '0,0030');
UPDATE itens_modelo SET valor_unitario='0,83' WHERE id_item_modelo=113;



-- arquivo 1.txt *************************** FIM

-- arquivo 2.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('114', 'ITM000114', 'Placa de obra em lona com plotagem gráfica', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '124', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '125', '0,382');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '126', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '127', '0,800');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('114', '2', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '15300', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('114', '15778', '0,600');
UPDATE itens_modelo SET valor_unitario='102,19' WHERE id_item_modelo=114;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('115', 'ITM000115', 'Barracão de madeira (incluindo intalações)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '128', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '129', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '131', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '132', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '133', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '134', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '135', '1,269');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '136', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '137', '0,333');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '138', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '139', '0,110');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '140', '0,250');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('115', '2', '1,500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('115', '5', '1,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('115', '15778', '1,300');
UPDATE itens_modelo SET valor_unitario='178,89' WHERE id_item_modelo=115;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('116', 'ITM000116', 'Limpeza manual geral com remoção de cobertura vegetal', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('116', '15778', '0,152');
UPDATE itens_modelo SET valor_unitario='1,39' WHERE id_item_modelo=116;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('117', 'ITM000117', 'Locação convencional de obra, através de gabarito de tábuas corridas pontaletadas a cada 1,50m, sem reaproveitamento', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '141', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '142', '0,020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '129', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '143', '0,040');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '144', '0,070');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('117', '2', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('117', '15778', '0,030');
UPDATE itens_modelo SET valor_unitario='4,78' WHERE id_item_modelo=117;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('118', 'ITM000118', 'Retirada de estrutura de madeira com tesouras para telhas cerâmicas (prédio antigo)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('118', '15778', '0,684');
UPDATE itens_modelo SET valor_unitario='6,29' WHERE id_item_modelo=118;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('119', 'ITM000119', 'Retirada de telhas de cerâmicas ou de vidro', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('119', '15778', '0,305');
UPDATE itens_modelo SET valor_unitario='2,80' WHERE id_item_modelo=119;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('120', 'ITM000120', 'Retirada de forro em réguas de pvc inclusive retirada de perfis', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('120', '15778', '0,273');
UPDATE itens_modelo SET valor_unitario='2,51' WHERE id_item_modelo=120;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('121', 'ITM000121', 'Retirada de grade de ferro (bloco antigo)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('121', '15778', '0,557');
UPDATE itens_modelo SET valor_unitario='5,12' WHERE id_item_modelo=121;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('122', 'ITM000122', 'Escavação manual de valas em terra compactada prof. de 0 m < h = 1 m', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('122', '15778', '1,543');
UPDATE itens_modelo SET valor_unitario='14,19' WHERE id_item_modelo=122;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('123', 'ITM000123', 'Bloco em concreto armado para fundações fck = 25mpa (incl. forma)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '1', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '2', '3,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '3', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '4', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '5', '4,944');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '12215', '6,680');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '15253', '6,680');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('123', '15778', '6,680');
UPDATE itens_modelo SET valor_unitario='1.232,08' WHERE id_item_modelo=123;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('124', 'ITM000124', 'Baldrame em concreto armado com cinta de amarração', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '1', '3,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '2', '3,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '3', '3,692');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '4', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '5', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '12215', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '15253', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('124', '15778', '6,791');
UPDATE itens_modelo SET valor_unitario='1.151,92' WHERE id_item_modelo=124;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('125', 'ITM000125', 'Concreto armado fck = 25mpa c/ forma em madeira branca para pilares e vigas', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '1', '4,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '2', '3,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '3', '6,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '4', '3,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '5', '4,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '142', '4,849');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '12215', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '15253', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('125', '15778', '6,518');
UPDATE itens_modelo SET valor_unitario='1.313,76' WHERE id_item_modelo=125;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('126', 'ITM000126', 'Laje pre-mold beta 11 p/ 1kn/m² vãos 4,4m incl.vigotas, tijolos, armadura negativa, capeamento 3cm, concreto 20mpa, escoramento, material e mão de obra', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '145', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '2', '0,220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '3', '0,320');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '146', '0,354');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '147', '1,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '148', '0,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '142', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '15253', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '12215', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('126', '15778', '0,103');
UPDATE itens_modelo SET valor_unitario='61,97' WHERE id_item_modelo=126;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('127', 'ITM000127', 'Alvenaria em tijolo cerâmico furado, assentado em argamassa traço 1:4 (cimento e areia média) preparo manual (incluindo fechamento parcial dos vãos das janelas das salas de aula, h=1m)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '149', '1,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '145', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '150', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '151', '1,596');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '15253', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('127', '15778', '0,800');
UPDATE itens_modelo SET valor_unitario='38,31' WHERE id_item_modelo=127;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('128', 'ITM000128', 'Chapisco aplicado tanto em pilares e vigas de concreto como em alvenarias, com rolo para textura acrílica, argamassa industrializada com preparo manual', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('128', '152', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('128', '153', '0,231');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('128', '15253', '0,095');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('128', '15778', '0,095');
UPDATE itens_modelo SET valor_unitario='6,29' WHERE id_item_modelo=128;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('129', 'ITM000129', 'Reboco argamassa traço 1:2 (cal e areia fina peneirada) espessura 0,5cm preparo manual da argamassa', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('129', '145', '0,132');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('129', '150', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('129', '151', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('129', '15253', '0,072');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('129', '15778', '0,072');
UPDATE itens_modelo SET valor_unitario='11,35' WHERE id_item_modelo=129;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('130', 'ITM000130', 'Contrapiso em argamassa traço 1:4 (cimento e areia), prepara mecânico com misturador 300 kg , aplicado em áreas secas sobre lajes, aderido, espesura 2 cm, acabamento reforçado - incluindo parte do piso do prédio antigo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('130', '145', '0,165');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('130', '150', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('130', '154', '0,180');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('130', '15253', '0,180');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('130', '15778', '0,180');
UPDATE itens_modelo SET valor_unitario='19,10' WHERE id_item_modelo=130;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('131', 'ITM000131', 'Revestimento cerâmico para piso com placas tipo gres de dimensões 35 x 35cm aplicada em ambientes internos e circulações', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('131', '155', '0,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('131', '156', '0,861');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('131', '157', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('131', '15253', '0,430');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('131', '15778', '0,430');
UPDATE itens_modelo SET valor_unitario='20,29' WHERE id_item_modelo=131;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('132', 'ITM000132', 'Rodapé cerâmico 7 cm de altura com placas tipo gres de dimensões 35 x 35cm. af 06/2014', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('132', '158', '0,130');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('132', '159', '0,332');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('132', '15253', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('132', '15778', '0,100');
UPDATE itens_modelo SET valor_unitario='3,79' WHERE id_item_modelo=132;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('133', 'ITM000133', 'Calçada e circulação (incl. alecerce, baldrame e concreto c/ junta seca)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('133', '2', '0,280');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('133', '145', '0,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('133', '160', '0,310');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('133', '15253', '0,460');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('133', '15778', '0,460');
UPDATE itens_modelo SET valor_unitario='51,92' WHERE id_item_modelo=133;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('134', 'ITM000134', 'Imunização de madeiramento para cobertura utilizando cupinicida incolor', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('134', '161', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('134', '162', '0,190');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('134', '15778', '0,150');
UPDATE itens_modelo SET valor_unitario='3,13' WHERE id_item_modelo=134;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('135', 'ITM000135', 'Estrutura de madeira de lei, primeira qualidade, serrado, não aparelhada para telhas cerâmicas', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('135', '163', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('135', '164', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('135', '165', '0,620');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('135', '2', '0,760');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('135', '15778', '0,760');
UPDATE itens_modelo SET valor_unitario='40,82' WHERE id_item_modelo=135;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('136', 'ITM000136', 'Estrutura em madeira aparelhada, para telhas cerâmicas, apoiada no vigamento da circulação', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('136', '166', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('136', '164', '0,478');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('136', '165', '0,600');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('136', '2', '0,760');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('136', '15778', '0,760');
UPDATE itens_modelo SET valor_unitario='36,76' WHERE id_item_modelo=136;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('137', 'ITM000137', 'Cobertura em telha cerâmica tipo plan, excluindo madeiramento', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('137', '167', '4,149');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('137', '16153', '0,770');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('137', '15778', '0,770');
UPDATE itens_modelo SET valor_unitario='20,53' WHERE id_item_modelo=137;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('138', 'ITM000138', 'Barroteamento para forro, com peças de madeira 2,5x10c m espaçadas de 50cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('138', '168', '0,255');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('138', '169', '0,400');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('138', '2', '0,340');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('138', '7', '0,340');
UPDATE itens_modelo SET valor_unitario='21,04' WHERE id_item_modelo=138;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('139', 'ITM000139', 'Forro em lambri de pvc - inclusive prédio antigo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('139', '170', '0,490');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('139', '171', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('139', '172', '0,300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('139', '2', '0,300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('139', '7', '0,300');
UPDATE itens_modelo SET valor_unitario='16,48' WHERE id_item_modelo=139;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('140', 'ITM000140', 'Revisão de ponto de água', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('140', '5', '1,582');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('140', '7', '1,582');
UPDATE itens_modelo SET valor_unitario='14,20' WHERE id_item_modelo=140;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('141', 'ITM000141', 'Revisão de ponto de esgoto', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('141', '5', '2,154');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('141', '7', '2,154');
UPDATE itens_modelo SET valor_unitario='19,34' WHERE id_item_modelo=141;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('142', 'ITM000142', 'Vaso sanitário sifonado louça branca padrão popular, com conjunto para fixação praa vaso sanitário com parafuso, arruela e bucha - fornecimento e instalação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '173', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '174', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '175', '1,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '176', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '177', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '178', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '179', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('142', '15253', '0,495');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('142', '7', '0,495');
UPDATE itens_modelo SET valor_unitario='160,33' WHERE id_item_modelo=142;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('143', 'ITM000143', 'Lavatório louça branca com coluna 44 x 35,5 cm, padrão popular, incluso sifão flexível em pvc, válvula e engate flexível 30 cm em plástico e com torneira cromada padrão popular - fornecimento e instalação. af_12/2013_p', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '180', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '181', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '182', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '183', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '184', '0,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('143', '185', '0,850');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('143', '5', '0,575');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('143', '7', '0,574');
UPDATE itens_modelo SET valor_unitario='159,08' WHERE id_item_modelo=143;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('144', 'ITM000144', 'Cabo de cobre 1,5 mm² - 750v', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('144', '187', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('144', '13758', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('144', '15778', '0,051');
UPDATE itens_modelo SET valor_unitario='1,28' WHERE id_item_modelo=144;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('145', 'ITM000145', 'Cabo de cobre 2,5 mm² - 750v', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('145', '188', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('145', '13758', '0,061');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('145', '15778', '0,062');
UPDATE itens_modelo SET valor_unitario='1,61' WHERE id_item_modelo=145;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('146', 'ITM000146', 'Cabo de cobre nu 10 mm² - fornecimento e instalção', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('146', '189', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('146', '13758', '0,112');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('146', '15778', '0,112');
UPDATE itens_modelo SET valor_unitario='4,79' WHERE id_item_modelo=146;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('147', 'ITM000147', 'Centro de distribuição p/ 6 disjuntores (s/ barramento)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('147', '190', '0,567');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('147', '13758', '0,450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('147', '15778', '0,450');
UPDATE itens_modelo SET valor_unitario='30,62' WHERE id_item_modelo=147;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('148', 'ITM000148', 'Disjuntor termomagnético monopolar padrão nema (americano) 10 a 30a 240v - fornecimento e instalação', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('148', '191', '0,305');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('148', '13758', '0,110');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('148', '15778', '0,110');
UPDATE itens_modelo SET valor_unitario='6,19' WHERE id_item_modelo=148;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('149', 'ITM000149', 'Tomada de embutir 2p+t 10a/250v c/ placa - fornecimento e instalação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('149', '192', '0,486');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('149', '13758', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('149', '15778', '0,120');
UPDATE itens_modelo SET valor_unitario='7,09' WHERE id_item_modelo=149;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('150', 'ITM000150', 'Luminária c/ 1 lamp. fluorescente 32w (sem fiação)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('150', '193', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('150', '13758', '0,519');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('150', '15778', '0,520');
UPDATE itens_modelo SET valor_unitario='52,20' WHERE id_item_modelo=150;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('151', 'ITM000151', 'Revisão de ponto de luz', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('151', '13758', '0,950');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('151', '15778', '0,949');
UPDATE itens_modelo SET valor_unitario='20,83' WHERE id_item_modelo=151;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('152', 'ITM000152', 'Ponto para ventilador de teto com fiação', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('152', '194', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('152', '13758', '0,460');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('152', '15778', '0,458');
UPDATE itens_modelo SET valor_unitario='42,47' WHERE id_item_modelo=152;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('153', 'ITM000153', 'Ventilador de teto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('153', '195', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('153', '13758', '1,701');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('153', '7', '1,701');
UPDATE itens_modelo SET valor_unitario='129,03' WHERE id_item_modelo=153;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('154', 'ITM000154', 'Porta de madeira almofadada semi-oca 1a 80x210x3cm, incluso aduela 2a, alizar 2a e dobradiças', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '196', '1,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '197', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '151', '1,450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '145', '0,650');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '150', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '198', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '199', '0,250');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '200', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '201', '2,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '202', '0,380');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('154', '2', '0,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('154', '15253', '0,300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('154', '7', '0,300');
UPDATE itens_modelo SET valor_unitario='355,68' WHERE id_item_modelo=154;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('155', 'ITM000155', 'Grade de ferro em barra chata 3/16', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('155', '203', '0,950');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('155', '204', '0,520');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('155', '15253', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('155', '15778', '0,800');
UPDATE itens_modelo SET valor_unitario='251,51' WHERE id_item_modelo=155;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('156', 'ITM000156', 'Pintura esmalte fosco em madeira, duas demãos (portas)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('156', '205', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('156', '206', '0,060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('156', '207', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('156', '208', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('156', '15300', '0,090');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('156', '7', '0,090');
UPDATE itens_modelo SET valor_unitario='7,81' WHERE id_item_modelo=156;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('157', 'ITM000157', 'Aplicação manual de pintura com tinta texturizada acrílica em paredes externas e internas', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('157', '209', '0,480');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('157', '15300', '0,220');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('157', '7', '0,220');
UPDATE itens_modelo SET valor_unitario='12,54' WHERE id_item_modelo=157;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('158', 'ITM000158', 'Acrílica sobre pintura antiga', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('158', '210', '0,205');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('158', '15300', '0,109');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('158', '7', '0,109');
UPDATE itens_modelo SET valor_unitario='4,25' WHERE id_item_modelo=158;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('159', 'ITM000159', 'Esmalte sobre grade de ferro (sup. aparelhada)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('159', '211', '1,349');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('159', '13758', '0,080');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('159', '7', '0,080');
UPDATE itens_modelo SET valor_unitario='22,89' WHERE id_item_modelo=159;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('160', 'ITM000160', 'Limpeza final da obra', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('160', '15778', '0,206');
UPDATE itens_modelo SET valor_unitario='1,89' WHERE id_item_modelo=160;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('161', 'ITM000161', 'Resina para piso em korudur', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('161', '212', '0,576');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('161', '7', '0,080');
UPDATE itens_modelo SET valor_unitario='10,66' WHERE id_item_modelo=161;



-- arquivo 2.txt *************************** FIM

-- arquivo 3.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('162', 'ITM000162', 'Placa de obra - padrão governo federal', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '124', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '125', '0,382');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '126', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '127', '0,800');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('162', '2', '0,960');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '15300', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('162', '15778', '0,980');
UPDATE itens_modelo SET valor_unitario='126,87' WHERE id_item_modelo=162;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('163', 'ITM000163', 'Instalação provisória de água', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '128', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '129', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '131', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '132', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '133', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '134', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '135', '1,269');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '136', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '137', '0,333');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '138', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '139', '0,110');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '140', '0,250');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('163', '2', '6,500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('163', '5', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('163', '15778', '6,500');
UPDATE itens_modelo SET valor_unitario='278,83' WHERE id_item_modelo=163;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('164', 'ITM000164', 'Instalação provisória de energia elétrica em baixa tensão', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('164', '213', '0,890');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('164', '13758', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('164', '15778', '0,550');
UPDATE itens_modelo SET valor_unitario='608,51' WHERE id_item_modelo=164;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('165', 'ITM000165', 'Instalações provisórias de esgoto', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('165', '214', '0,890');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('165', '15253', '0,550');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('165', '2', '0,550');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('165', '5', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('165', '15778', '0,550');
UPDATE itens_modelo SET valor_unitario='774,26' WHERE id_item_modelo=165;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('166', 'ITM000166', 'Barracões provisórios (depósito, escritório, vestiário e refeitório) com piso cimentado', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '215', '0,015');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '216', '1,020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '217', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '218', '0,015');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '219', '0,386');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '220', '0,214');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '221', '0,0057');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '222', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '223', '0,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '224', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '225', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '226', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '227', '0,318');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '228', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '229', '0,0115');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '230', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '462', '0,3030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '232', '1,2800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '233', '0,0346');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '234', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '235', '0,5360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '236', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '237', '0,0220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '238', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '239', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '240', '0,0240');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('166', '2', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '241', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '13758', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '242', '0,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('166', '15778', '0,550');
UPDATE itens_modelo SET valor_unitario='98,11' WHERE id_item_modelo=166;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('167', 'ITM000167', 'Locação da obra (execução de gabarito)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('167', '243', '0,020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('167', '26', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('167', '28', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('167', '230', '0,050');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('167', '2', '0,035');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('167', '15778', '0,035');
UPDATE itens_modelo SET valor_unitario='0,76' WHERE id_item_modelo=167;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('168', 'ITM000168', 'Sondagem do terreno ( um furo de 7m a cada 200 m²)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('168', '244', '1,000');
UPDATE itens_modelo SET valor_unitario='59,88' WHERE id_item_modelo=168;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('169', 'ITM000169', 'Tapume de chapa de madeira compensada, 6mm (40x2,00m, frente do terreno)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '245', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '246', '0,2273');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '26', '1,5800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '247', '0,2200');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('169', '2', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '15300', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('169', '15778', '0,9500');
UPDATE itens_modelo SET valor_unitario='23,96' WHERE id_item_modelo=169;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('170', 'ITM000170', 'Aterro apiloado em camadas de 0,20 m com material argilo-arenoso entre baldrames', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('170', '248', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('170', '15778', '0,950');
UPDATE itens_modelo SET valor_unitario='46,59' WHERE id_item_modelo=170;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('171', 'ITM000171', 'Concreto armado para vigas de respaldo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('171', '249', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('171', '251', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('171', '252', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('171', '15778', '0,960');
UPDATE itens_modelo SET valor_unitario='1.004,81' WHERE id_item_modelo=171;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('172', 'ITM000172', 'Laje pré-moldada para cobertura, intereixo 38cm, h = 12cm, elemento de enchimento em bloco cerâmico, capeamento de 4cm, inclusive armadura, escoramento, material e mão-de-abro, conforme projeto', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '253', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '254', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '255', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '256', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '28', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '29', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('172', '2', '0,005');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '15253', '0,005');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('172', '15778', '0,005');
UPDATE itens_modelo SET valor_unitario='48,26' WHERE id_item_modelo=172;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('173', 'ITM000173', 'Cobogó de concreto - (7 x 30 x 30 cm), assentado com argamassa traço 1:4 (cimento e areia)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('173', '258', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('173', '259', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('173', '15253', '0,360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('173', '15778', '0,360');
UPDATE itens_modelo SET valor_unitario='78,56' WHERE id_item_modelo=173;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('174', 'ITM000174', 'Divisórias de banheiros e sanitários em granito com espessura 2cm polido assentado com argamasssa traço 1:4', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('174', '258', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('174', '260', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('174', '261', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('174', '262', '0,140');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('174', '15778', '0,140');
UPDATE itens_modelo SET valor_unitario='389,25' WHERE id_item_modelo=174;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('175', 'ITM000175', 'Porta de madeira - p01 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('175', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('175', '2', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('175', '15253', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('175', '15778', '0,307');
UPDATE itens_modelo SET valor_unitario='271,73' WHERE id_item_modelo=175;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('176', 'ITM000176', 'Porta de madeira - p02 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('176', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('176', '2', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('176', '15253', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('176', '15778', '0,307');
UPDATE itens_modelo SET valor_unitario='271,73' WHERE id_item_modelo=176;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('177', 'ITM000177', 'Porta de madeira - p03 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('177', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('177', '2', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('177', '15253', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('177', '15778', '0,307');
UPDATE itens_modelo SET valor_unitario='271,73' WHERE id_item_modelo=177;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('178', 'ITM000178', 'Porta de madeira - p05 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('178', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('178', '2', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('178', '15253', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('178', '15778', '0,307');
UPDATE itens_modelo SET valor_unitario='271,73' WHERE id_item_modelo=178;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('179', 'ITM000179', 'Porta de madeira - pm04b - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('179', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('179', '2', '0,171');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('179', '15253', '0,171');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('179', '15778', '0,171');
UPDATE itens_modelo SET valor_unitario='268,04' WHERE id_item_modelo=179;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('180', 'ITM000180', 'Porta de madeira - pm04c - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('180', '263', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('180', '2', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('180', '15253', '0,307');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('180', '15778', '0,307');
UPDATE itens_modelo SET valor_unitario='271,73' WHERE id_item_modelo=180;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('181', 'ITM000181', 'Porta de madeira - banheiros e sanitários completa incluisve trageta metálica', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('181', '264', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('181', '15253', '0,090');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('181', '15778', '0,090');
UPDATE itens_modelo SET valor_unitario='192,71' WHERE id_item_modelo=181;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('182', 'ITM000182', 'Porta de ferro - pf1 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('182', '265', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('182', '11', '0,546');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('182', '15253', '0,546');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('182', '15778', '0,546');
UPDATE itens_modelo SET valor_unitario='197,91' WHERE id_item_modelo=182;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('183', 'ITM000183', 'Porta de ferro - pf2 - com ferragens, conforme projeto de esquadrias', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('183', '265', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('183', '11', '0,546');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('183', '15253', '0,546');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('183', '15778', '0,546');
UPDATE itens_modelo SET valor_unitario='197,91' WHERE id_item_modelo=183;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('184', 'ITM000184', 'Janela de ferrp ef-17-a - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('184', '266', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('184', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('184', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('184', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='193,35' WHERE id_item_modelo=184;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('185', 'ITM000185', 'Janela de ferrp ef-17-b - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('185', '267', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('185', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('185', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('185', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='193,35' WHERE id_item_modelo=185;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('186', 'ITM000186', 'Janela de ferrp ef-19 - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('186', '268', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('186', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('186', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('186', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='262,19' WHERE id_item_modelo=186;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('187', 'ITM000187', 'Janela de ferrp ef-28 - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('187', '269', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('187', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('187', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('187', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='262,19' WHERE id_item_modelo=187;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('188', 'ITM000188', 'Janela de ferrp ef-31 - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('188', '270', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('188', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('188', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('188', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='262,19' WHERE id_item_modelo=188;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('189', 'ITM000189', 'Janela de ferrp ef-32 - com ferragens, conforme projeto de esquadrias - basculante - inclusive vidro 4mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('189', '271', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('189', '11', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('189', '15253', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('189', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='193,35' WHERE id_item_modelo=189;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('190', 'ITM000190', 'Estrtura metálica com vidro fixo 8mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('190', '272', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('190', '15253', '1,750');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('190', '15778', '1,750');
UPDATE itens_modelo SET valor_unitario='66,13' WHERE id_item_modelo=190;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('191', 'ITM000191', 'Estrutura de madeira aparelhada com tesoura vão 3,0 a 7,0 m, primeira para telha cerâmica', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('191', '163', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('191', '164', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('191', '165', '0,620');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('191', '2', '0,285');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('191', '15778', '0,285');
UPDATE itens_modelo SET valor_unitario='33,98' WHERE id_item_modelo=191;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('192', 'ITM000192', 'Cobertura em telha cerâmica tipo capa e canal', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('192', '273', '0,200');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('192', '2', '0,285');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('192', '15778', '0,285');
UPDATE itens_modelo SET valor_unitario='35,14' WHERE id_item_modelo=192;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('193', 'ITM000193', 'Cumeeira com telha cerâmica emboçada com argamassa traço 1:2:8', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('193', '166', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('193', '164', '0,478');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('193', '165', '0,600');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('193', '2', '0,065');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('193', '15778', '0,065');
UPDATE itens_modelo SET valor_unitario='26,74' WHERE id_item_modelo=193;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('194', 'ITM000194', 'Calha em chapa de aço galvanizado nº 24 desenvolvimento 33cm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('194', '167', '4,149');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('194', '16153', '0,374');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('194', '15778', '0,374');
UPDATE itens_modelo SET valor_unitario='12,53' WHERE id_item_modelo=194;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('195', 'ITM000195', 'Impermeabilização de calhas de concreto com mastique betuminoso a frio', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '168', '0,255');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '169', '0,400');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('195', '2', '0,190');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '15778', '0,190');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '170', '0,490');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '171', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('195', '172', '0,300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('195', '2', '0,300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('195', '7', '0,300');
UPDATE itens_modelo SET valor_unitario='37,19' WHERE id_item_modelo=195;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('196', 'ITM000196', 'Chapisco de aderência em paredes internas e externas', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('196', '5', '0,124');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('196', '15778', '0,124');
UPDATE itens_modelo SET valor_unitario='1,78' WHERE id_item_modelo=196;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('197', 'ITM000197', 'Chapisco de aderência em lajes pré-moldadas', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('197', '5', '0,124');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('197', '15778', '0,124');
UPDATE itens_modelo SET valor_unitario='1,78' WHERE id_item_modelo=197;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('198', 'ITM000198', 'Emboço pra paredes internas e externas traço 1:5 - preparo manual - espessura 2cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('198', '274', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('198', '15253', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('198', '15778', '0,100');
UPDATE itens_modelo SET valor_unitario='8,41' WHERE id_item_modelo=198;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('199', 'ITM000199', 'Reboco tipo paulista para paredes internas e externas - espessura 2,0cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('199', '274', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('199', '15253', '0,020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('199', '15778', '0,020');
UPDATE itens_modelo SET valor_unitario='10,38' WHERE id_item_modelo=199;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('200', 'ITM000200', 'Reboco tipo paulista para lajes - espessura 2,0cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('200', '275', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('200', '276', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('200', '277', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('200', '15253', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('200', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='13,02' WHERE id_item_modelo=200;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('201', 'ITM000201', 'Revestimento cerâmico de paredes pei iii - cerâmica 20 x 20cm - incl. rejunte -conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('201', '278', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('201', '276', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('201', '277', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('201', '15253', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('201', '15778', '0,600');
UPDATE itens_modelo SET valor_unitario='26,78' WHERE id_item_modelo=201;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('202', 'ITM000202', 'Revestimento cerâmico de paredes pei iii - cerâmica 10 x 10cm - incl. rejunte -conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('202', '279', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('202', '276', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('202', '277', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('202', '15253', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('202', '15778', '0,800');
UPDATE itens_modelo SET valor_unitario='31,23' WHERE id_item_modelo=202;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('203', 'ITM000203', 'Camada impermeabilizadora e=5cm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('203', '280', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('203', '15253', '0,390');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('203', '15778', '0,390');
UPDATE itens_modelo SET valor_unitario='19,24' WHERE id_item_modelo=203;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('204', 'ITM000204', 'Camada regularizadora e=3cm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('204', '281', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('204', '15253', '0,250');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('204', '15778', '0,250');
UPDATE itens_modelo SET valor_unitario='8,82' WHERE id_item_modelo=204;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('205', 'ITM000205', 'Piso de alta resistência em massa granilítica, inclusive polimento e enceramento', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('205', '189', '0,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('205', '15253', '0,750');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('205', '15778', '0,750');
UPDATE itens_modelo SET valor_unitario='18,79' WHERE id_item_modelo=205;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('206', 'ITM000206', 'Pios cerâmico esmaltada pei iv - 20 x 20 cm - incl. rejunte - conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('206', '282', '0,567');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('206', '15253', '0,450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('206', '15778', '0,450');
UPDATE itens_modelo SET valor_unitario='35,48' WHERE id_item_modelo=206;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('207', 'ITM000207', 'Lastro de areia para o playground', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('207', '191', '0,305');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('207', '15253', '0,670');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('207', '15778', '0,670');
UPDATE itens_modelo SET valor_unitario='18,47' WHERE id_item_modelo=207;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('208', 'ITM000208', 'Piso de cimento desempenado com juntas e dilatação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('208', '192', '0,486');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('208', '15253', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('208', '15778', '0,120');
UPDATE itens_modelo SET valor_unitario='7,09' WHERE id_item_modelo=208;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('209', 'ITM000209', 'Blocos de argamassa armada pré-fabricados 50 x 50 cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('209', '193', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('209', '15253', '0,009');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('209', '15778', '0,009');
UPDATE itens_modelo SET valor_unitario='41,00' WHERE id_item_modelo=209;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('210', 'ITM000210', 'Piso de pedra rolada', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('210', '15253', '0,189');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('210', '15778', '0,189');
UPDATE itens_modelo SET valor_unitario='4,13' WHERE id_item_modelo=210;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('211', 'ITM000211', 'Blocrete intervalado de concreto', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('211', '15253', '0,795');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('211', '15778', '0,795');
UPDATE itens_modelo SET valor_unitario='17,43' WHERE id_item_modelo=211;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('212', 'ITM000212', 'Rodapé em massa granilítica h=10cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '196', '1,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '197', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '151', '1,450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '145', '0,650');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '150', '0,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '198', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '199', '0,250');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '200', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '201', '2,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '202', '0,380');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('212', '2', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '15253', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('212', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='349,18' WHERE id_item_modelo=212;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('213', 'ITM000213', 'Soleira em granito', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('213', '283', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('213', '15253', '0,220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('213', '15778', '0,220');
UPDATE itens_modelo SET valor_unitario='19,56' WHERE id_item_modelo=213;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('214', 'ITM000214', 'Pietoril em granito (2x18) cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('214', '284', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('214', '15253', '0,220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('214', '15778', '0,220');
UPDATE itens_modelo SET valor_unitario='19,56' WHERE id_item_modelo=214;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('215', 'ITM000215', 'Roda meio em madeira (largura 10cm)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('215', '285', '0,950');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('215', '204', '0,520');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('215', '15253', '0,002');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('215', '15778', '0,002');
UPDATE itens_modelo SET valor_unitario='138,13' WHERE id_item_modelo=215;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('216', 'ITM000216', 'Emassamento de paredes internas e externas com massa acrílica - 02 demãos', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '286', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '206', '0,060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '207', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '208', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '15300', '0,013');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('216', '15778', '0,013');
UPDATE itens_modelo SET valor_unitario='6,61' WHERE id_item_modelo=216;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('217', 'ITM000217', 'Emassamento de lajes internas e externas com massa acrílica - 02 demãos', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('217', '287', '0,480');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('217', '15300', '0,009');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('217', '15778', '0,009');
UPDATE itens_modelo SET valor_unitario='11,87' WHERE id_item_modelo=217;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('218', 'ITM000218', 'Pintura em látex acrílico 02 demãos sobre paredes internas e externas', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('218', '288', '0,205');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('218', '15300', '0,109');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('218', '15778', '0,109');
UPDATE itens_modelo SET valor_unitario='4,09' WHERE id_item_modelo=218;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('219', 'ITM000219', 'Pintura em látex acrílico 02 demãos sobre lajes internas e externas', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('219', '289', '0,205');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('219', '15300', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('219', '15778', '0,120');
UPDATE itens_modelo SET valor_unitario='4,64' WHERE id_item_modelo=219;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('220', 'ITM000220', 'Pintura em esmalte sintético 02 demãos em esquadrias de madeira', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('220', '290', '0,205');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('220', '15300', '0,145');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('220', '15778', '0,145');
UPDATE itens_modelo SET valor_unitario='4,90' WHERE id_item_modelo=220;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('221', 'ITM000221', 'Pintura em esmalte sintético 02 demãos em esquadrias de ferro', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('221', '291', '0,205');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('221', '15300', '0,230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('221', '15778', '0,230');
UPDATE itens_modelo SET valor_unitario='8,68' WHERE id_item_modelo=221;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('222', 'ITM000222', 'Quadro de distruição deral de daixa tensão, de embutir, completo com 04 disjuntores tripolar, com barramento para as fases, neutro e para proteção, disjuntor geral trifásico de 200a e dispositivo de proteção contra surtos, metálco, pintura eletrostática epóxi cor bege c/ porta, trinco e acessórios (qgd - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('222', '13758', '0,980');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('222', '15778', '0,980');
UPDATE itens_modelo SET valor_unitario='21,49' WHERE id_item_modelo=222;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('223', 'ITM000223', 'Quadro de distruição de embutir, completo, com 07 circuitos (05 disjuntores monopolares e 02 disjuntores bipolares), com barramento para as fases, neutro e para proteção, disjunutor geral trifásico de 30a e 01 dispositivo diferencial residual, metálico, pintura eletrostática epóxi cor bege c/ porta, trinco e acessórios (qd-1 - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('223', '13758', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('223', '15778', '1,100');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=223;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('224', 'ITM000224', 'Quadro de distruição de embutir, completo, com 10 circuitos (03 disjuntores monopolares e 03 disjuntores bipolares), com barramento para as fases, neutro e para proteção, disjuntor geral trifásico de 50a e 06 dispositivos diferencial residual, metálico, pintura eletrostática epóxi cor bege c/ porta, trinco e acessórios (qd-2 - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('224', '13758', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('224', '15778', '1,100');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=224;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('225', 'ITM000225', 'Quadro de distruição de embutir, completo, com 08 circuitos (02 disjuntores monopolares e 06 disjuntores bipolares), com barramento para as fases, neutro e para proteção, disjuntor geral trifásico de 50a e 04 dispositivos diferencial residual, metálico, pintura eletrostática epóxi cor bege c/ porta, trinco e acessórios (qd-3 - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('225', '13758', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('225', '15778', '1,100');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=225;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('226', 'ITM000226', 'Quadro de distruição de embutir, completo, com 24 circuitos (17 disjuntores monopolares e 07 disjuntores bipolares), com barramento para as fases, neutro e para proteção, disjuntor geral trifásico de 100a e 13 dispositivos diferencial residual, metálico, pintura eletrostática epóxi cor bege c/ porta, trinco e acessórios (qd-4 - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('226', '13758', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('226', '15778', '1,100');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=226;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('227', 'ITM000227', 'Quadro de comando de motor de embutir, completo, p/ 02 motores de 3/4 cv (01 de reserva), para controle automàtcio do nível de água de reservatório superior e inferior, com contatores, bases fusíveis completas com fusível, relé térmico de sobrecarga, relé de falta de fase, chaves e lâmpadas c/ porta, trinco e acessórios (qcd - conforme projeto)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('227', '13758', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('227', '15778', '1,100');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=227;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('228', 'ITM000228', 'Eletroduto pvc flexível, ø16mm (dn 3/8), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('228', '298', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('228', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('228', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='2,79' WHERE id_item_modelo=228;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('229', 'ITM000229', 'Eletroduto pvc flexível corrugado refrçado , ø20mm (dn 1/2), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('229', '299', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('229', '13758', '0,008');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('229', '15778', '0,008');
UPDATE itens_modelo SET valor_unitario='3,25' WHERE id_item_modelo=229;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('230', 'ITM000230', 'Eletroduto pvc flexível corrugado refrçado , ø25mm (dn 3/4), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('230', '300', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('230', '13758', '0,014');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('230', '15778', '0,014');
UPDATE itens_modelo SET valor_unitario='4,03' WHERE id_item_modelo=230;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('231', 'ITM000231', 'Eletroduto, ø31mm (dn 1), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('231', '301', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('231', '13758', '0,040');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('231', '15778', '0,040');
UPDATE itens_modelo SET valor_unitario='7,93' WHERE id_item_modelo=231;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('232', 'ITM000232', 'Eletroduto, ø41mm (dn 1.1/4), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('232', '302', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('232', '13758', '0,090');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('232', '15778', '0,090');
UPDATE itens_modelo SET valor_unitario='11,15' WHERE id_item_modelo=232;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('233', 'ITM000233', 'Eletroduto, ø47mm (dn 1.1/2), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('233', '303', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('233', '13758', '0,092');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('233', '15778', '0,092');
UPDATE itens_modelo SET valor_unitario='12,19' WHERE id_item_modelo=233;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('234', 'ITM000234', 'Eletroduto, ø59mm (dn 2), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('234', '304', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('234', '13758', '0,095');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('234', '15778', '0,095');
UPDATE itens_modelo SET valor_unitario='13,65' WHERE id_item_modelo=234;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('235', 'ITM000235', 'Eletroduto, ø75mm (dn 2.1/2), inclusiva curvas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('235', '305', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('235', '13758', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('235', '15778', '0,100');
UPDATE itens_modelo SET valor_unitario='15,78' WHERE id_item_modelo=235;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('236', 'ITM000236', 'Caixa de passagem 40x40 cm em alvenaria com tampa de ferro fundido tipo leve', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('236', '306', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('236', '13758', '0,990');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('236', '15778', '0,990');
UPDATE itens_modelo SET valor_unitario='83,18' WHERE id_item_modelo=236;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('237', 'ITM000237', '# 1,5 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('237', '307', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('237', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('237', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='1,49' WHERE id_item_modelo=237;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('238', 'ITM000238', '# 2,5 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('238', '308', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('238', '13758', '0,005');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('238', '15778', '0,005');
UPDATE itens_modelo SET valor_unitario='1,89' WHERE id_item_modelo=238;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('239', 'ITM000239', '# 4 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('239', '309', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('239', '13758', '0,008');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('239', '15778', '0,008');
UPDATE itens_modelo SET valor_unitario='2,77' WHERE id_item_modelo=239;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('240', 'ITM000240', '# 6 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('240', '310', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('240', '13758', '0,026');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('240', '15778', '0,026');
UPDATE itens_modelo SET valor_unitario='3,41' WHERE id_item_modelo=240;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('241', 'ITM000241', '# 10 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('241', '311', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('241', '13758', '0,035');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('241', '15778', '0,035');
UPDATE itens_modelo SET valor_unitario='5,40' WHERE id_item_modelo=241;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('242', 'ITM000242', '# 16 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('242', '312', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('242', '13758', '0,047');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('242', '15778', '0,047');
UPDATE itens_modelo SET valor_unitario='6,05' WHERE id_item_modelo=242;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('243', 'ITM000243', '# 25 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('243', '313', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('243', '13758', '0,077');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('243', '15778', '0,077');
UPDATE itens_modelo SET valor_unitario='8,58' WHERE id_item_modelo=243;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('244', 'ITM000244', '# 35 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('244', '314', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('244', '13758', '0,097');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('244', '15778', '0,097');
UPDATE itens_modelo SET valor_unitario='13,35' WHERE id_item_modelo=244;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('245', 'ITM000245', '# 70 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('245', '315', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('245', '13758', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('245', '15778', '0,100');
UPDATE itens_modelo SET valor_unitario='24,70' WHERE id_item_modelo=245;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('246', 'ITM000246', '# 120 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('246', '316', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('246', '13758', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('246', '15778', '0,350');
UPDATE itens_modelo SET valor_unitario='35,90' WHERE id_item_modelo=246;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('247', 'ITM000247', 'Tomada universal circular, 2p+t, 15a/250v, cor preta, completa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('247', '317', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('247', '13758', '0,094');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('247', '15778', '0,094');
UPDATE itens_modelo SET valor_unitario='5,49' WHERE id_item_modelo=247;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('248', 'ITM000248', 'Tomada universal circular, 3p, 20a/250v, cor preta, completa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('248', '318', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('248', '13758', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('248', '15778', '0,100');
UPDATE itens_modelo SET valor_unitario='10,33' WHERE id_item_modelo=248;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('249', 'ITM000249', 'Interruptor simples 10a, completo', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('249', '319', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('249', '13758', '0,003');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('249', '15778', '0,003');
UPDATE itens_modelo SET valor_unitario='6,39' WHERE id_item_modelo=249;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('250', 'ITM000250', 'Interruptor duas seções 10a por seção, completo', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('250', '320', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('250', '13758', '0,015');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('250', '15778', '0,015');
UPDATE itens_modelo SET valor_unitario='11,72' WHERE id_item_modelo=250;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('251', 'ITM000251', 'Interruptor com dimmer, completo', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('251', '321', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('251', '13758', '0,015');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('251', '15778', '0,015');
UPDATE itens_modelo SET valor_unitario='11,72' WHERE id_item_modelo=251;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('252', 'ITM000252', 'Luminária 2x40w, ccompleta', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('252', '322', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('252', '13758', '0,080');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('252', '15778', '0,080');
UPDATE itens_modelo SET valor_unitario='72,44' WHERE id_item_modelo=252;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('253', 'ITM000253', 'Luminária 2x20w, ccompleta', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('253', '323', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('253', '13758', '0,080');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('253', '15778', '0,080');
UPDATE itens_modelo SET valor_unitario='66,77' WHERE id_item_modelo=253;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('254', 'ITM000254', 'Luminárias incandescentes 100w', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('254', '324', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('254', '13758', '0,080');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('254', '15778', '0,080');
UPDATE itens_modelo SET valor_unitario='34,23' WHERE id_item_modelo=254;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('255', 'ITM000255', 'Arandela 100w', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('255', '325', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('255', '13758', '0,056');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('255', '15778', '0,056');
UPDATE itens_modelo SET valor_unitario='29,17' WHERE id_item_modelo=255;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('256', 'ITM000256', 'Caixa de passagem 4x4 para tomada/interruptor', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('256', '326', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('256', '13758', '0,056');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('256', '15778', '0,056');
UPDATE itens_modelo SET valor_unitario='4,26' WHERE id_item_modelo=256;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('257', 'ITM000257', 'Caixa de passagem 4x2 para tomada e interruptor', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('257', '327', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('257', '13758', '0,046');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('257', '15778', '0,046');
UPDATE itens_modelo SET valor_unitario='3,53' WHERE id_item_modelo=257;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('258', 'ITM000258', 'Caixa de passagem de ferro esmaltada octogonal 4x4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('258', '328', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('258', '13758', '0,049');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('258', '15778', '0,049');
UPDATE itens_modelo SET valor_unitario='3,58' WHERE id_item_modelo=258;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('259', 'ITM000259', 'Patch panel 19 - 24 portas, categoria 6', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('259', '329', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('259', '13758', '1,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('259', '15778', '1,500');
UPDATE itens_modelo SET valor_unitario='313,02' WHERE id_item_modelo=259;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('260', 'ITM000260', 'Switch de 24 portas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('260', '330', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('260', '13758', '1,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('260', '15778', '1,600');
UPDATE itens_modelo SET valor_unitario='395,15' WHERE id_item_modelo=260;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('261', 'ITM000261', 'Bloco 110 para rack 19 100 pares', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('261', '331', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('261', '13758', '1,340');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('261', '15778', '1,340');
UPDATE itens_modelo SET valor_unitario='348,39' WHERE id_item_modelo=261;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('262', 'ITM000262', 'Guia de cabos frontal, fechado', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('262', '332', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('262', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('262', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='4,55' WHERE id_item_modelo=262;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('263', 'ITM000263', 'Guia de cabos trazeiros', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('263', '333', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('263', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('263', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='4,55' WHERE id_item_modelo=263;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('264', 'ITM000264', 'Trava path panel', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('264', '334', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('264', '13758', '0,003');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('264', '15778', '0,003');
UPDATE itens_modelo SET valor_unitario='6,82' WHERE id_item_modelo=264;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('265', 'ITM000265', 'Guia de cabos vertical, fechado', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('265', '335', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('265', '13758', '0,003');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('265', '15778', '0,003');
UPDATE itens_modelo SET valor_unitario='6,82' WHERE id_item_modelo=265;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('266', 'ITM000266', 'Guia de cabos superior, fechado', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('266', '336', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('266', '13758', '0,003');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('266', '15778', '0,003');
UPDATE itens_modelo SET valor_unitario='6,82' WHERE id_item_modelo=266;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('267', 'ITM000267', 'Cabo par trançado não blindado (utp) - 4 pares 24 awg, 100 ohms - categoria 6', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('267', '337', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('267', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('267', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='3,11' WHERE id_item_modelo=267;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('268', 'ITM000268', 'Cabo telefônico inetrno ci-50, 20 - pares', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('268', '338', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('268', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('268', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='5,05' WHERE id_item_modelo=268;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('269', 'ITM000269', 'Cabo coaxial', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('269', '339', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('269', '13758', '0,001');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('269', '15778', '0,001');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=269;



-- arquivo 3.txt *************************** FIM

-- arquivo 4.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('270', 'ITM000270', 'Concreto armado fck = 20mpa c/ forma em madeira branca', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '1', '5,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '2', '3,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '3', '4,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '4', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '5', '4,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '12215', '6,680');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '15253', '6,680');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('270', '15778', '6,699');
UPDATE itens_modelo SET valor_unitario='1.298,63' WHERE id_item_modelo=270;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('271', 'ITM000271', 'Bloco em concreto armado para fundações (incl. forma)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '1', '3,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '2', '3,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '3', '3,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '4', '4,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '5', '4,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '12215', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '15253', '6,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('271', '15778', '7,101');
UPDATE itens_modelo SET valor_unitario='1.243,04' WHERE id_item_modelo=271;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('272', 'ITM000272', 'Calçada (incl. alecerce, baldrame e concreto c/ junta seca)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('272', '2', '0,280');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('272', '145', '0,310');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('272', '160', '0,310');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('272', '15253', '0,460');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('272', '15778', '0,460');
UPDATE itens_modelo SET valor_unitario='52,32' WHERE id_item_modelo=272;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('273', 'ITM000273', 'Baldrame em concreto simples c/ seixo incl. forma mad. branca', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '1', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '2', '0,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '3', '2,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '4', '3,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '5', '2,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '12215', '4,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '15253', '4,500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('273', '15778', '3,824');
UPDATE itens_modelo SET valor_unitario='644,84' WHERE id_item_modelo=273;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('274', 'ITM000274', 'Alvenaria em tijolo de barrao a singelo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '149', '0,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '145', '0,060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '150', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '151', '0,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '15253', '0,547');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('274', '15778', '0,550');
UPDATE itens_modelo SET valor_unitario='18,46' WHERE id_item_modelo=274;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('275', 'ITM000275', 'Chapisco de areia e cimento no traço 1:3', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '145', '0,020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '150', '0,030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '151', '0,080');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '153', '0,080');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '15253', '0,061');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('275', '15778', '0,061');
UPDATE itens_modelo SET valor_unitario='3,84' WHERE id_item_modelo=275;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('276', 'ITM000276', 'Retirada de reboco ou emboço', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('276', '15253', '0,057');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('276', '15778', '0,056');
UPDATE itens_modelo SET valor_unitario='1,23' WHERE id_item_modelo=276;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('277', 'ITM000277', 'Rebco com argamassa 1:6 adit. plast.', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '145', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '150', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '151', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '340', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '15253', '0,170');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('277', '15778', '0,180');
UPDATE itens_modelo SET valor_unitario='17,49' WHERE id_item_modelo=277;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('278', 'ITM000278', 'Aterro interno (edificações) compactado manualmente', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('278', '341', '1,495');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('278', '15778', '0,700');
UPDATE itens_modelo SET valor_unitario='27,25' WHERE id_item_modelo=278;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('279', 'ITM000279', 'Estrutura em madeira de lei para telha de barro - peça serrada', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('279', '163', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('279', '164', '0,600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('279', '165', '0,440');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('279', '2', '0,568');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('279', '15778', '0,560');
UPDATE itens_modelo SET valor_unitario='30,16' WHERE id_item_modelo=279;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('280', 'ITM000280', 'Tesoura completa em mad. de lei serrada, para telhados com vãos de 10m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('280', '342', '5,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('280', '164', '9,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('280', '165', '7,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('280', '2', '6,601');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('280', '15778', '6,600');
UPDATE itens_modelo SET valor_unitario='1.450,45' WHERE id_item_modelo=280;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('281', 'ITM000281', 'Calha em chapa galvanizada', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('281', '343', '0,170');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('281', '344', '0,290');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('281', '345', '0,030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('281', '346', '0,030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('281', '16153', '0,654');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('281', '7', '0,650');
UPDATE itens_modelo SET valor_unitario='23,35' WHERE id_item_modelo=281;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('282', 'ITM000282', 'Manta asfáltica sbs - 3mm com filme de polietileno', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '347', '0,170');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '348', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '150', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '145', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '349', '0,030');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('282', '7', '0,030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '15253', '0,640');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('282', '15778', '0,647');
UPDATE itens_modelo SET valor_unitario='27,95' WHERE id_item_modelo=282;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('283', 'ITM000283', 'Piso de alta resistência e = 8mm com resina incl. camada regularizadora', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '145', '0,320');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '150', '0,260');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '350', '0,230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '154', '0,279');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '15253', '0,530');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('283', '15778', '0,530');
UPDATE itens_modelo SET valor_unitario='53,66' WHERE id_item_modelo=283;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('284', 'ITM000284', 'Barra em aço inox - pne', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('284', '351', '0,726');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('284', '15253', '0,640');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('284', '15778', '0,640');
UPDATE itens_modelo SET valor_unitario='164,84' WHERE id_item_modelo=284;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('285', 'ITM000285', 'Mini cerca em ripa de madeira para proteção da área de lazer', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '352', '0,044');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '168', '0,060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '353', '0,040');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '354', '0,060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '355', '0,070');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('285', '2', '0,140');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('285', '15778', '0,140');
UPDATE itens_modelo SET valor_unitario='8,61' WHERE id_item_modelo=285;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('286', 'ITM000286', 'Passarela coberta com telhas de barra tipo plan - pilar sanduiche', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '356', '2,840');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '164', '3,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '165', '3,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '167', '6,400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '16153', '5,550');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('286', '15253', '5,550');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('286', '7', '6,633');
UPDATE itens_modelo SET valor_unitario='547,39' WHERE id_item_modelo=286;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('287', 'ITM000287', 'Banco em madeira de lei c = 1,8m, l = 0,4m e h = 0,4m', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('287', '357', '0,539');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('287', '129', '1,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('287', '358', '0,700');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('287', '2', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('287', '15778', '0,350');
UPDATE itens_modelo SET valor_unitario='135,30' WHERE id_item_modelo=287;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('288', 'ITM000288', 'Bancada de mármore e = 3cm, polido com furo para cuba', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('288', '359', '0,980');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('288', '145', '0,760');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('288', '150', '0,777');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('288', '15253', '0,780');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('288', '15778', '0,850');
UPDATE itens_modelo SET valor_unitario='417,29' WHERE id_item_modelo=288;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('289', 'ITM000289', 'Lavatório s/ coluna (incl. torn., sifão e válvula) - pne', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '360', '0,840');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '180', '0,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '181', '1,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '182', '1,410');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '183', '0,860');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('289', '185', '1,102');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('289', '5', '2,350');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('289', '7', '2,350');
UPDATE itens_modelo SET valor_unitario='313,57' WHERE id_item_modelo=289;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('290', 'ITM000290', 'Bacia sifonada - pne', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '361', '0,881');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '174', '4,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '362', '2,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '176', '2,800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '177', '4,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '178', '3,300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '179', '2,900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('290', '15253', '4,350');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('290', '7', '4,350');
UPDATE itens_modelo SET valor_unitario='526,89' WHERE id_item_modelo=290;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('291', 'ITM000291', 'Barra lisa c/ argamassa de cimeto, areia e barro (para pontos de bicicleta)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '363', '0,200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '145', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '150', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '364', '0,198');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '15253', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('291', '15778', '0,150');
UPDATE itens_modelo SET valor_unitario='21,11' WHERE id_item_modelo=291;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('292', 'ITM000292', 'Pva sobre muro', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('292', '365', '0,191');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('292', '366', '0,350');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('292', '15300', '0,060');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('292', '7', '0,060');
UPDATE itens_modelo SET valor_unitario='2,68' WHERE id_item_modelo=292;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('293', 'ITM000293', 'Esmalte sobre madeira com massa e selador', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '367', '0,150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '368', '0,130');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '207', '0,100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '208', '0,135');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '13758', '0,120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('293', '15778', '0,120');
UPDATE itens_modelo SET valor_unitario='16,33' WHERE id_item_modelo=293;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('294', 'ITM000294', 'Acrílica fosca int./ext. c/ massa e selador - 3 demãos', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('294', '369', '0,700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('294', '15300', '0,310');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('294', '7', '0,318');
UPDATE itens_modelo SET valor_unitario='12,43' WHERE id_item_modelo=294;



-- arquivo 4.txt *************************** FIM

-- arquivo 5.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('295', 'ITM000295', 'Parede em tábua forte', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('295', '2', '0,500000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('295', '3', '0,500000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('295', '370', '0,040000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('295', '371', '0,046000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('295', '372', '0,160000');
UPDATE itens_modelo SET valor_unitario='38.533,66' WHERE id_item_modelo=295;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('296', 'ITM000296', 'Porta em madeira não industrializada 0,80 x 2,10 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('296', '2', '0,840000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('296', '3', '0,840000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('296', '370', '0,067200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('296', '371', '0,050000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('296', '373', '3,000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('296', '374', '0,268800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('296', '375', '1,000000');
UPDATE itens_modelo SET valor_unitario='39.780,10' WHERE id_item_modelo=296;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('297', 'ITM000297', 'Porta em madeira não industrializada 0,70 x 2,10 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('297', '2', '0,840000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('297', '3', '0,840000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('297', '370', '0,067200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('297', '371', '0,050000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('297', '373', '3,000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('297', '374', '0,235200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('297', '375', '1,000000');
UPDATE itens_modelo SET valor_unitario='41.280,10' WHERE id_item_modelo=297;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('298', 'ITM000298', 'Porta em madeira não industrializada 0,60 x 2,10 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('298', '2', '0,630000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('298', '3', '0,630000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('298', '370', '0,050000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('298', '371', '0,037500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('298', '373', '3,000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('298', '374', '0,201600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('298', '375', '1,000000');
UPDATE itens_modelo SET valor_unitario='41.278,22' WHERE id_item_modelo=298;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('299', 'ITM000299', 'Janela em madeira não industrializada 1,50 x 1,20 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('299', '2', '0,900000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('299', '3', '0,900000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('299', '370', '0,072000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('299', '371', '0,042000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('299', '373', '4,000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('299', '374', '0,288000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('299', '376', '1,000000');
UPDATE itens_modelo SET valor_unitario='38.570,67' WHERE id_item_modelo=299;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('300', 'ITM000300', 'Balancim em madeira não industrializada 0,60 x 0,50 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('300', '2', '0,900000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('300', '3', '0,900000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('300', '370', '0,072000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('300', '371', '0,042000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('300', '377', '1,000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('300', '374', '0,048000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('300', '378', '1,000000');
UPDATE itens_modelo SET valor_unitario='40.245,72' WHERE id_item_modelo=300;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('301', 'ITM000301', 'Tomada simples c/ placa 4x2 de sobrepor', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('301', '8', '0,110000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('301', '3', '0,110000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('301', '379', '1,000000');
UPDATE itens_modelo SET valor_unitario='58,28' WHERE id_item_modelo=301;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('302', 'ITM000302', 'Interruptor de sobrepor 1 tecla', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('302', '8', '0,050000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('302', '3', '0,050000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('302', '380', '1,000000');
UPDATE itens_modelo SET valor_unitario='11,59' WHERE id_item_modelo=302;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('303', 'ITM000303', 'Interruptor de sobrepor 2 teclas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('303', '8', '0,090000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('303', '3', '0,090000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('303', '381', '1,000000');
UPDATE itens_modelo SET valor_unitario='36,67' WHERE id_item_modelo=303;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('304', 'ITM000304', 'Caixa dágua de fibra de vidro capacidade 500 litros', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('304', '5', '7,7000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('304', '382', '5,0000000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('304', '5', '7,7000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('304', '383', '1,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('304', '384', '2,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('304', '385', '2,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('304', '386', '4,0000000');
UPDATE itens_modelo SET valor_unitario='30.962,06' WHERE id_item_modelo=304;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('305', 'ITM000305', 'Junção pvc 45° esg. ø 40 mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('305', '5', '0,2500000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('305', '5', '0,2500000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('305', '387', '1,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('305', '388', '0,0141000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('305', '389', '0,0020000');
UPDATE itens_modelo SET valor_unitario='2.675,80' WHERE id_item_modelo=305;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('306', 'ITM000306', 'Engate plástico ½ x 0,40 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('306', '5', '0,1000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('306', '390', '1,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('306', '391', '0,0030000');
UPDATE itens_modelo SET valor_unitario='130,62' WHERE id_item_modelo=306;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('307', 'ITM000307', 'Fossa séptica de concreto pré-moldado para 5 contribuintes (fornecimento, escavação e reaterro)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '392', '4,5780000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '393', '2,5430000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '394', '3,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '395', '0,1480510');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '396', '2,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('307', '397', '2,0000000');
UPDATE itens_modelo SET valor_unitario='1.724.892,45' WHERE id_item_modelo=307;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('308', 'ITM000308', 'Sumidouro de concreto pré-moldado completo para 5 contribuintes (fornecimento, escavação e reaterro)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '392', '4,5780000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '393', '3,2220000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '394', '2,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '398', '0,1326650');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '395', '0,0817190');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '396', '1,0000000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('308', '397', '1,0000000');
UPDATE itens_modelo SET valor_unitario='1.740.935,20' WHERE id_item_modelo=308;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('309', 'ITM000309', 'Camada impermeabilizadora 0,10 m com pedra preta', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('309', '399', '0,1000000');
UPDATE itens_modelo SET valor_unitario='144.027,84' WHERE id_item_modelo=309;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('310', 'ITM000310', 'Calçada de proteção', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '392', '0,0450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '401', '0,0580');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '402', '0,0450');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '403', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '404', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('310', '405', '1,0000');
UPDATE itens_modelo SET valor_unitario='155.725,03' WHERE id_item_modelo=310;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('311', 'ITM000311', 'Ralo sifonado', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('311', '5', '0,1200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('311', '406', '1,0000');
UPDATE itens_modelo SET valor_unitario='23,75' WHERE id_item_modelo=311;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('312', 'ITM000312', 'Concreto armado fck= 18 mpa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '407', '55,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '408', '22,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '12072', '7,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '409', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '410', '0,6139');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '12215', '7,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '411', '0,6500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('312', '2', '17,5500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '412', '1,1405');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '413', '369,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '414', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '415', '0,1200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '416', '0,8780');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '15253', '4,6400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '417', '2,5200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '15778', '10,9200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('312', '12067', '17,5500');
UPDATE itens_modelo SET valor_unitario='189.273,34' WHERE id_item_modelo=312;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('313', 'ITM000313', 'Joelho 90° 20 mm x 1/2 ', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('313', '5', '0,1800');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('313', '3', '0,1800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('313', '418', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('313', '419', '0,0060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('313', '420', '0,0240');
UPDATE itens_modelo SET valor_unitario='1.540,28' WHERE id_item_modelo=313;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('314', 'ITM000314', 'Joelho 90° 25 mm x 20 mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('314', '5', '0,1800');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('314', '3', '0,1800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('314', '421', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('314', '419', '0,0060');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('314', '420', '0,0240');
UPDATE itens_modelo SET valor_unitario='1.540,61' WHERE id_item_modelo=314;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('315', 'ITM000315', 'Torneira de pressão pvc para pia', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('315', '5', '0,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('315', '5', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('315', '420', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('315', '423', '1,0000');
UPDATE itens_modelo SET valor_unitario='68,09' WHERE id_item_modelo=315;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('316', 'ITM000316', 'Caixa de descarga de sobrepor com parafuso', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('316', '424', '2,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('316', '425', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('316', '5', '1,4500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('316', '7', '1,4500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('316', '426', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('316', '427', '4,0000');
UPDATE itens_modelo SET valor_unitario='508,76' WHERE id_item_modelo=316;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('317', 'ITM000317', 'Pia em marmorite', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('317', '428', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('317', '429', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('317', '260', '1,1000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('317', '5', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('317', '3', '1,0000');
UPDATE itens_modelo SET valor_unitario='251.478,83' WHERE id_item_modelo=317;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('318', 'ITM000318', 'Torneira de pressão pvc para lavatorio', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('318', '5', '0,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('318', '5', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('318', '420', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('318', '430', '1,0000');
UPDATE itens_modelo SET valor_unitario='13,58' WHERE id_item_modelo=318;



-- arquivo 5.txt *************************** FIM

-- arquivo 6.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('319', 'ITM000319', 'Pavimentação asfáltica cbuq', '0,00', '4', 'ATIVO', 'NAO', 'NORMAL');
insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('320', 'ITM000320', 'Escarificação', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('320', '6', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('320', '3', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('320', '431', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('320', '432', '1,0000');
UPDATE itens_modelo SET valor_unitario='13,39' WHERE id_item_modelo=320;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('321', 'ITM000321', 'Alambrado em ferro galvanizado pintado com tinta antiferruginosa, h= 2,00 m sobre mureta', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '433', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '434', '2,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '435', '0,0110');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '436', '0,1400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '437', '1,4500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '438', '2,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('321', '439', '0,2400');
UPDATE itens_modelo SET valor_unitario='266,01' WHERE id_item_modelo=321;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('322', 'ITM000322', 'Banco isolado (2,00 x 0,40 x 0,42m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('322', '440', '1,3200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('322', '441', '0,0405');
UPDATE itens_modelo SET valor_unitario='76,45' WHERE id_item_modelo=322;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('323', 'ITM000323', 'Gangorra com 3 pranchas em madeira e estrutura de ferro completa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('323', '3', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('323', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('323', '442', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('323', '392', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('323', '443', '0,0500');
UPDATE itens_modelo SET valor_unitario='925,79' WHERE id_item_modelo=323;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('324', 'ITM000324', 'Carrocel de ferro médio', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('324', '3', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('324', '6', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('324', '444', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('324', '392', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('324', '443', '0,050');
UPDATE itens_modelo SET valor_unitario='1.035,77' WHERE id_item_modelo=324;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('325', 'ITM000325', 'Balanço de ferro 3 cadeiras', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('325', '3', '1,000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('325', '6', '1,000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('325', '445', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('325', '392', '0,050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('325', '443', '0,050');
UPDATE itens_modelo SET valor_unitario='835,79' WHERE id_item_modelo=325;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('326', 'ITM000326', 'Escorregador de ferro médio', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('326', '3', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('326', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('326', '446', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('326', '392', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('326', '443', '0,0500');
UPDATE itens_modelo SET valor_unitario='848,04' WHERE id_item_modelo=326;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('327', 'ITM000327', 'Desobstrução de rede de esgoto com auxílio de equipamento hidrojato', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('327', '3', '1,0000');
UPDATE itens_modelo SET valor_unitario='3,77' WHERE id_item_modelo=327;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('328', 'ITM000328', 'Desobstrução e limpeza de boca-de-lobo em concreto, com 0,50 m³/ und.', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('328', '3', '1,5000');
UPDATE itens_modelo SET valor_unitario='5,65' WHERE id_item_modelo=328;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('329', 'ITM000329', 'Concreto armado fck= 18 mpa, inclusive forma', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('329', '6', '4,6400');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('329', '2', '17,5500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('329', '1', '7,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('329', '7', '7,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('329', '3', '10,9200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '12067', '17,5500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '407', '55,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '408', '22,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '409', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '410', '0,6139');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '411', '0,6500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '412', '1,1405');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '413', '369,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '414', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '415', '0,1200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '416', '0,8780');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('329', '417', '2,5200');
UPDATE itens_modelo SET valor_unitario='1.106,19' WHERE id_item_modelo=329;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('330', 'ITM000330', 'Tampa para poço de visita concreto tipo a, 150x150mm, com tampa circular ø 400mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('331', 'ITM000331', 'Tampa para poço de visita concreto tipo a ø 600 mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('331', '3', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('331', '447', '6,5673');
UPDATE itens_modelo SET valor_unitario='20,39' WHERE id_item_modelo=331;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('332', 'ITM000332', 'Tampa em concreto 800x800mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('333', 'ITM000333', 'Desobstrução de tubos de concreto d= 400mm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('333', '3', '1,0000');
UPDATE itens_modelo SET valor_unitario='3,77' WHERE id_item_modelo=333;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('334', 'ITM000334', 'Desobstrução de tubos de concreto d= 500mm a 1200mm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('334', '3', '1,0000');
UPDATE itens_modelo SET valor_unitario='3,77' WHERE id_item_modelo=334;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('335', 'ITM000335', 'Limpeza de poço de visita em concreto armado d= 500mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('335', '3', '1,7472');
UPDATE itens_modelo SET valor_unitario='6,58' WHERE id_item_modelo=335;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('336', 'ITM000336', 'Limpeza de poço de visita em concreto armado d= 600mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('336', '3', '1,9488');
UPDATE itens_modelo SET valor_unitario='7,34' WHERE id_item_modelo=336;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('337', 'ITM000337', 'Limpeza de poço de visita em concreto armado d= 800mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('337', '3', '2,6880');
UPDATE itens_modelo SET valor_unitario='10,13' WHERE id_item_modelo=337;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('338', 'ITM000338', 'Limpeza de poço de visita em concreto armado d= 1000mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('338', '3', '3,5424');
UPDATE itens_modelo SET valor_unitario='13,35' WHERE id_item_modelo=338;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('339', 'ITM000339', 'Limpeza de poço de visita em concreto armado d= 1200mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('339', '3', '4,4880');
UPDATE itens_modelo SET valor_unitario='16,91' WHERE id_item_modelo=339;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('340', 'ITM000340', 'Desobstrução de tubo pvc, pb, je dn = 150 mm', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('340', '3', '1,0000');
UPDATE itens_modelo SET valor_unitario='3,77' WHERE id_item_modelo=340;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('341', 'ITM000341', 'Limpeza de poço de visita em anéis pré-moldados (prof. até 1,50 m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('341', '3', '0,3533');
UPDATE itens_modelo SET valor_unitario='1,33' WHERE id_item_modelo=341;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('342', 'ITM000342', 'Limpeza de poço de visita em anéis pré-moldados (prof. entre 1,50 m e 2,50 m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('342', '3', '1,5700');
UPDATE itens_modelo SET valor_unitario='5,91' WHERE id_item_modelo=342;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('343', 'ITM000343', 'Limpeza de poço de visita em anéis pré-moldados (prof. maior que 2,50 m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('343', '3', '2,3550');
UPDATE itens_modelo SET valor_unitario='8,87' WHERE id_item_modelo=343;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('344', 'ITM000344', 'Reboco liso externo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('344', '6', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('344', '3', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('344', '448', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('344', '449', '7,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('344', '450', '0,0306');
UPDATE itens_modelo SET valor_unitario='15,75' WHERE id_item_modelo=344;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('345', 'ITM000345', 'Alvenaria de tijolos ceramicos e= 10 cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('345', '451', '0,0110');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('345', '6', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('345', '3', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('345', '452', '24,0000');
UPDATE itens_modelo SET valor_unitario='23,14' WHERE id_item_modelo=345;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('346', 'ITM000346', 'Tampa para boca de lobo', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('346', '3', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('346', '447', '4,1045');
UPDATE itens_modelo SET valor_unitario='13,07' WHERE id_item_modelo=346;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('347', 'ITM000347', 'Desobstrução e limpeza de caixas de passagem 0,60x0,60m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('347', '3', '0,5000');
UPDATE itens_modelo SET valor_unitario='1,88' WHERE id_item_modelo=347;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('348', 'ITM000348', 'Limpeza de poço de visita em concreto armado d= 2 x 1200mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('348', '3', '21,8790');
UPDATE itens_modelo SET valor_unitario='82,48' WHERE id_item_modelo=348;



-- arquivo 6.txt *************************** FIM

-- arquivo 7.txt *************************** INICIO

UPDATE itens_modelo SET valor_unitario='0,00' WHERE id_item_modelo=348;



-- arquivo 7.txt *************************** FIM

-- arquivo 8.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('349', 'ITM000349', 'Barracão de madeira (incl. instalações)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '215', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '216', '1,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '217', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '218', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '219', '0,3860');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '220', '0,2140');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '221', '0,0057');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '222', '0,7000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '224', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '225', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '226', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '227', '0,3180');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '228', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '229', '0,0115');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '230', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '462', '0,3030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '232', '1,2800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '233', '0,0346');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '234', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '235', '0,5360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '236', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '237', '0,0220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '238', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '239', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '240', '0,0240');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('349', '2', '4,4790');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '241', '2,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '13758', '2,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '242', '2,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('349', '15778', '4,4700');
UPDATE itens_modelo SET valor_unitario='206,49' WHERE id_item_modelo=349;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('350', 'ITM000350', 'Locação da obra a trena', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('350', '243', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('350', '28', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('350', '230', '0,0190');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('350', '2', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('350', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='1,58' WHERE id_item_modelo=350;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('351', 'ITM000351', 'Mobilização e desmobilização de pessoal e equipamentos', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('351', '12', '24,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('351', '5', '3,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('351', '15778', '24,0000');
UPDATE itens_modelo SET valor_unitario='361,47' WHERE id_item_modelo=351;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('352', 'ITM000352', 'Placa da obra em chapa galvanizada', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('352', '453', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('352', '454', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('352', '456', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('352', '224', '0,1100');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('352', '2', '0,5090');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('352', '15778', '0,0400');
UPDATE itens_modelo SET valor_unitario='213,35' WHERE id_item_modelo=352;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('353', 'ITM000353', 'Tapume c/ chapa de madeirit e=10mm (h=2.20m)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '245', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '246', '0,2273');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '26', '1,5800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '247', '0,2200');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('353', '2', '1,1020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '15300', '1,1020');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('353', '15778', '1,1000');
UPDATE itens_modelo SET valor_unitario='37,13' WHERE id_item_modelo=353;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('354', 'ITM000354', 'Demolição de piso incl. camada impermeabilizadora', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('354', '15778', '0,5108');
UPDATE itens_modelo SET valor_unitario='4,69' WHERE id_item_modelo=354;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('355', 'ITM000355', 'Demolição manual de alvenaria de tijolo', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('355', '15778', '2,6240');
UPDATE itens_modelo SET valor_unitario='24,14' WHERE id_item_modelo=355;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('356', 'ITM000356', 'Retirada de esquadria sem aproveitamento', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('356', '15778', '0,2270');
UPDATE itens_modelo SET valor_unitario='2,08' WHERE id_item_modelo=356;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('357', 'ITM000357', 'Retirada de grade de ferro', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('357', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='2,76' WHERE id_item_modelo=357;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('358', 'ITM000358', 'Retirada de louça sanitária', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('358', '15778', '0,7889');
UPDATE itens_modelo SET valor_unitario='7,25' WHERE id_item_modelo=358;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('359', 'ITM000359', 'Retirada de pilar de madeira', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('359', '15778', '0,7920');
UPDATE itens_modelo SET valor_unitario='7,28' WHERE id_item_modelo=359;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('360', 'ITM000360', 'Retirada de ponto de água/esgoto', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('360', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='2,76' WHERE id_item_modelo=360;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('361', 'ITM000361', 'Retirada de ponto elétrico', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('361', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='0,92' WHERE id_item_modelo=361;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('362', 'ITM000362', 'Demolição da estrutura em madeira da cobertura', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('362', '15778', '0,1678');
UPDATE itens_modelo SET valor_unitario='1,54' WHERE id_item_modelo=362;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('363', 'ITM000363', 'Retirada de telhas de barro', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('363', '15778', '0,1678');
UPDATE itens_modelo SET valor_unitario='1,54' WHERE id_item_modelo=363;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('364', 'ITM000364', 'Escavação manual ate 1.50m de profundidade', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('364', '15778', '2,4030');
UPDATE itens_modelo SET valor_unitario='22,10' WHERE id_item_modelo=364;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('365', 'ITM000365', 'Baldrame em concreto armado c/ cinta de amarração', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '468', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '25', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '26', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '469', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '28', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '29', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '470', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '243', '0,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('365', '11', '4,4400');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('365', '2', '4,4400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '15253', '4,4400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('365', '15778', '1,3980');
UPDATE itens_modelo SET valor_unitario='252,86' WHERE id_item_modelo=365;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('366', 'ITM000366', 'Bloco em concreto armado p/ fundaçao (incl. forma)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '468', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '25', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '26', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '469', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '28', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '29', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '470', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '243', '0,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('366', '11', '4,4400');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('366', '2', '4,4400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '15253', '4,4400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('366', '15778', '1,5364');
UPDATE itens_modelo SET valor_unitario='254,13' WHERE id_item_modelo=366;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('367', 'ITM000367', 'Concreto armado fck=25mpa com forma aparente - 1 reaproveitamento', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '25', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '26', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '469', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '28', '0,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '29', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '470', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '243', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '472', '0,3000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('367', '11', '0,6500');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('367', '2', '0,6500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '15253', '0,6500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('367', '15778', '0,6246');
UPDATE itens_modelo SET valor_unitario='37,27' WHERE id_item_modelo=367;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('368', 'ITM000368', 'Alvenaria tijolo de barro a cutelo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('368', '6', '10,3700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('368', '15253', '1,1400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('368', '15778', '0,8800');
UPDATE itens_modelo SET valor_unitario='3.963,21' WHERE id_item_modelo=368;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('369', 'ITM000369', 'Encaibramento e ripamento', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('369', '241', '1,1400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('369', '15778', '0,8800');
UPDATE itens_modelo SET valor_unitario='20,49' WHERE id_item_modelo=369;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('370', 'ITM000370', 'Estrutura metálica - (incl. pintura anti-corrosiva)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('370', '241', '1,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('370', '7', '1,0000');
UPDATE itens_modelo SET valor_unitario='20,09' WHERE id_item_modelo=370;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('371', 'ITM000371', 'Tesoura em mad. de lei p/ vao de 6.0m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('371', '241', '4,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('371', '7', '2,0000');
UPDATE itens_modelo SET valor_unitario='56,50' WHERE id_item_modelo=371;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('372', 'ITM000372', 'Tesoura em mad. de lei p/ vao de 8.0m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('372', '241', '4,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('372', '7', '2,0000');
UPDATE itens_modelo SET valor_unitario='56,50' WHERE id_item_modelo=372;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('373', 'ITM000373', 'Cobertura - telha plan', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('373', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('373', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=373;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('374', 'ITM000374', 'Cobertura em policarbonato incolor- incl. estr. metálica', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('374', '14953', '3,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('374', '15778', '2,0000');
UPDATE itens_modelo SET valor_unitario='76,85' WHERE id_item_modelo=374;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('375', 'ITM000375', 'Cumeeira de barro', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('375', '14953', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('375', '15778', '0,1500');
UPDATE itens_modelo SET valor_unitario='3,88' WHERE id_item_modelo=375;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('376', 'ITM000376', 'Rincão em chapa galvanizada - l=1,0m', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('376', '14953', '0,3500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('376', '15778', '0,3500');
UPDATE itens_modelo SET valor_unitario='9,06' WHERE id_item_modelo=376;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('377', 'ITM000377', 'Aplicação de neutrol s/ concreto/alvenaria', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('377', '15253', '0,2100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('377', '15778', '0,1700');
UPDATE itens_modelo SET valor_unitario='4,23' WHERE id_item_modelo=377;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('378', 'ITM000378', 'Imunização p/madeira c/carbolineum', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('378', '15253', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('378', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='0,21' WHERE id_item_modelo=378;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('379', 'ITM000379', 'Porta mad. compens. c/ caix. aduela e alizar', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('379', '2', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('379', '15253', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('379', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='58,67' WHERE id_item_modelo=379;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('380', 'ITM000380', 'Grade de ferro em metalom (incl. pint.anti-corrosiva)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('380', '11', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('380', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('380', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='30,96' WHERE id_item_modelo=380;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('381', 'ITM000381', 'Porta de aço-esteira de enrolar c/ferr.(incl.pint.anti-corrosiva)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('381', '11', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('381', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('381', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='30,96' WHERE id_item_modelo=381;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('382', 'ITM000382', 'Portão de ferro em metalom (incl. pintura anti corrosiva)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('382', '11', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('382', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('382', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='30,96' WHERE id_item_modelo=382;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('383', 'ITM000383', 'Esquadria de alum.de correr c/ vidro e ferragens', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('383', '2', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('383', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=383;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('384', 'ITM000384', 'Vidro temperado incolor e= 8mm com ferragens', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('384', '16726', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('384', '15778', '0,9000');
UPDATE itens_modelo SET valor_unitario='18,17' WHERE id_item_modelo=384;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('385', 'ITM000385', 'Fechadura para porta de banheiro', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('385', '14953', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('385', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='24,40' WHERE id_item_modelo=385;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('386', 'ITM000386', 'Fechadura de embutir completa, para portas internas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('386', '14953', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('386', '7', '1,0000');
UPDATE itens_modelo SET valor_unitario='20,47' WHERE id_item_modelo=386;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('387', 'ITM000387', 'Ferragens p/ porta de banheiro', '0,00', '18', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('387', '14953', '1,3000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('387', '7', '2,2000');
UPDATE itens_modelo SET valor_unitario='30,00' WHERE id_item_modelo=387;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('388', 'ITM000388', 'Ferragens p/ porta interna 1 fl.', '0,00', '18', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('388', '14953', '1,3000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('388', '7', '2,2000');
UPDATE itens_modelo SET valor_unitario='30,00' WHERE id_item_modelo=388;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('389', 'ITM000389', 'Cerâmica 20x20cm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('389', '276', '6,1400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('389', '277', '0,2200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('389', '15253', '0,2893');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('389', '15778', '0,2000');
UPDATE itens_modelo SET valor_unitario='37,24' WHERE id_item_modelo=389;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('390', 'ITM000390', 'Chapisco de cimento e areia no traço 1:3', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('390', '15253', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('390', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=390;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('391', 'ITM000391', 'Emboço', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('391', '15253', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('391', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=391;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('392', 'ITM000392', 'Reboco', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('392', '14953', '0,9000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('392', '7', '0,9000');
UPDATE itens_modelo SET valor_unitario='18,42' WHERE id_item_modelo=392;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('393', 'ITM000393', 'Rodape ceramico', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('393', '15253', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('393', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='0,21' WHERE id_item_modelo=393;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('394', 'ITM000394', 'Calçada (incl.alicerce, baldrame e concreto c/ junta seca)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('394', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('394', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='21,94' WHERE id_item_modelo=394;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('395', 'ITM000395', 'Camada impermeabilizadora e=10cm c/ seixo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('395', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('395', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='21,94' WHERE id_item_modelo=395;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('396', 'ITM000396', 'Camada regularizadora no traço 1:4', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('396', '413', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('396', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('396', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='15,55' WHERE id_item_modelo=396;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('397', 'ITM000397', 'Cerâmica anti-derrapante', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('397', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('397', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='21,94' WHERE id_item_modelo=397;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('398', 'ITM000398', 'Esmalte sobre madeira c/ massa e selador', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('398', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('398', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='21,94' WHERE id_item_modelo=398;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('399', 'ITM000399', 'Barroteamento em madeira de lei p/ forro pvc', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('399', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('399', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='10,97' WHERE id_item_modelo=399;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('400', 'ITM000400', 'Forro em lambri de pvc', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('400', '15253', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('400', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='10,97' WHERE id_item_modelo=400;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('401', 'ITM000401', 'Esmalte sobre grade de ferro (superf. aparelhada)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('401', '15300', '0,3120');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('401', '15778', '0,2140');
UPDATE itens_modelo SET valor_unitario='5,93' WHERE id_item_modelo=401;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('402', 'ITM000402', 'Acrilica (sobre pintura antiga)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('402', '15300', '0,0090');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('402', '15778', '0,0400');
UPDATE itens_modelo SET valor_unitario='0,47' WHERE id_item_modelo=402;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('403', 'ITM000403', 'Acrilica fosca int./ext. c/massa e selador - 3 demaos', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('403', '15300', '0,2420');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('403', '15778', '0,1900');
UPDATE itens_modelo SET valor_unitario='4,82' WHERE id_item_modelo=403;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('404', 'ITM000404', 'Acrílica para piso', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('404', '15300', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('404', '15778', '0,0090');
UPDATE itens_modelo SET valor_unitario='0,46' WHERE id_item_modelo=404;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('405', 'ITM000405', 'Centro de distribuição p/ 16 disjuntores (c/ barramento)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('405', '13758', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('405', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='45,65' WHERE id_item_modelo=405;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('406', 'ITM000406', 'Quadro de mediçao trifasico (c/ disjuntor)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('406', '13758', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('406', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='45,65' WHERE id_item_modelo=406;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('407', 'ITM000407', 'Ponto de força (tubul., fiaçao e disjuntor) acima de 200w', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('407', '13758', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('407', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='45,65' WHERE id_item_modelo=407;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('408', 'ITM000408', 'Ponto de luz / força (c/tubul., cx. e fiaçao) ate 200w', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('408', '13758', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('408', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='21,94' WHERE id_item_modelo=408;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('409', 'ITM000409', 'Ponto p/ ventilador de teto (c/ fiaçao)', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('409', '13758', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('409', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='32,91' WHERE id_item_modelo=409;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('410', 'ITM000410', 'Luminária p/ lâmp pll de embutir', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('410', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('410', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=410;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('411', 'ITM000411', 'Ponto de agua (incl. tubos e conexoes)', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('411', '5', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('411', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='22,22' WHERE id_item_modelo=411;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('412', 'ITM000412', 'Reservatório em fibra de vidro 3.000 l', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('412', '5', '3,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('412', '15778', '2,5000');
UPDATE itens_modelo SET valor_unitario='41,23' WHERE id_item_modelo=412;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('413', 'ITM000413', 'Fossa septica em concreto armado - cap=150 pessoas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('413', '12215', '3,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('413', '15391', '22,5520');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('413', '15253', '11,6390');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('413', '15778', '16,4350');
UPDATE itens_modelo SET valor_unitario='676,88' WHERE id_item_modelo=413;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('414', 'ITM000414', 'Ponto de esgoto (incl. tubos, conexoes,cx. e ralos)', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('414', '5', '2,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('414', '15778', '1,5000');
UPDATE itens_modelo SET valor_unitario='25,78' WHERE id_item_modelo=414;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('415', 'ITM000415', 'Sumidouro em alvenaria c/ tpo.em concreto - cap=150 pessoas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('415', '12215', '3,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('415', '15391', '22,5520');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('415', '15253', '11,6390');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('415', '15778', '16,4350');
UPDATE itens_modelo SET valor_unitario='676,88' WHERE id_item_modelo=415;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('416', 'ITM000416', 'Tubo em pvc - 100mm (ls)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('416', '5', '0,1440');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('416', '15778', '0,1440');
UPDATE itens_modelo SET valor_unitario='2,07' WHERE id_item_modelo=416;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('417', 'ITM000417', 'Joelho/cotovelo 90º rc em pvc - js - 100mm-ls', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('417', '5', '0,0720');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('417', '15778', '0,0720');
UPDATE itens_modelo SET valor_unitario='1,03' WHERE id_item_modelo=417;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('418', 'ITM000418', 'Extintor de incêndio (pó químico) - 12 kg', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('418', '5', '1,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('418', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='18,57' WHERE id_item_modelo=418;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('419', 'ITM000419', 'Extintor de incêndio abc - 12kg', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('419', '5', '0,8600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('419', '15778', '0,8600');
UPDATE itens_modelo SET valor_unitario='12,39' WHERE id_item_modelo=419;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('420', 'ITM000420', 'Extintor de incendio co2-6kg', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('420', '5', '1,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('420', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='19,37' WHERE id_item_modelo=420;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('421', 'ITM000421', 'Bacia sifonada - pne', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('421', '5', '1,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('421', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='16,49' WHERE id_item_modelo=421;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('422', 'ITM000422', 'Bacia sifonada c/cx. descarga acoplada c/ assento', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('422', '5', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('422', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='15,45' WHERE id_item_modelo=422;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('423', 'ITM000423', 'Barra em aço inox (pne)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('423', '5', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('423', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=423;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('424', 'ITM000424', 'Bebedouro aço inox c/4 torneiras e filtro (det.5)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('424', '5', '2,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('424', '15778', '1,7000');
UPDATE itens_modelo SET valor_unitario='28,66' WHERE id_item_modelo=424;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('425', 'ITM000425', 'Lavatorio de louça c/col.,torn.,mistur.,sifao e valv.', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('425', '5', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('425', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=425;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('426', 'ITM000426', 'Mictório coletivo em aço c/ registro de pressão - 1,5m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('426', '5', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('426', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='18,85' WHERE id_item_modelo=426;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('427', 'ITM000427', 'Pia 02 cubas em aço inox.c/torn.,sifoes e valv.(2.0m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('427', '5', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('427', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=427;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('428', 'ITM000428', 'Porta papel higiênico - polipropileno', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('428', '5', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('428', '15778', '0,9000');
UPDATE itens_modelo SET valor_unitario='12,96' WHERE id_item_modelo=428;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('429', 'ITM000429', 'Porta toalha de papel - polipropileno', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('429', '5', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('429', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=429;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('430', 'ITM000430', 'Saboneteira c/ reservatório - polipropileno', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('430', '5', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('430', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=430;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('431', 'ITM000431', 'Escada de marinheiro c/ proteçao', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('431', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('431', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='20,08' WHERE id_item_modelo=431;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('432', 'ITM000432', 'Quadro magnético branco c/ apoio para apagador e pincéis e moldura em alumínio 3,15 x 1,25 m', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('432', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('432', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=432;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('433', 'ITM000433', 'Torre em conc.armado p/ cx.dagua h=6,0m-base 2.0x2.0m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('433', '6', '2,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('433', '15778', '2,0000');
UPDATE itens_modelo SET valor_unitario='28,82' WHERE id_item_modelo=433;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('434', 'ITM000434', 'Bloco de concreto intertravado e=9cm (incl. colchao de areia e rejuntamento)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('434', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('434', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=434;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('435', 'ITM000435', 'Plantio de grama (incl. terra preta)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('435', '15778', '0,1040');
UPDATE itens_modelo SET valor_unitario='0,95' WHERE id_item_modelo=435;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('436', 'ITM000436', 'Limpeza geral e entrega da obra', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('436', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='0,82' WHERE id_item_modelo=436;



-- arquivo 8.txt *************************** FIM

-- arquivo 9.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('437', 'ITM000437', 'Apiloamento do aterro', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('437', '15778', '2,5253');
UPDATE itens_modelo SET valor_unitario='23,23' WHERE id_item_modelo=437;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('438', 'ITM000438', 'Disjuntor 01p - 10 a 30a - padrão din', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('438', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('438', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=438;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('439', 'ITM000439', 'Disjuntor 01p - 40 e 50a - padrão din', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('439', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('439', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=439;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('440', 'ITM000440', 'Disjuntor 02p - 15 a 50a - padrão din', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('440', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('440', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=440;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('441', 'ITM000441', 'Disjuntor 03p - 15 a 50a - padrão din', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('441', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('441', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=441;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('442', 'ITM000442', 'Mictorio individual em louça c/ acessorios', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('442', '5', '1,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('442', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='18,85' WHERE id_item_modelo=442;

UPDATE itens_modelo SET valor_unitario='0,00' WHERE id_item_modelo=442;



-- arquivo 9.txt *************************** FIM

-- arquivo 10.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('443', 'ITM000443', 'Emassamento de parede c/ massa acrilica', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('443', '15300', '0,2420');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('443', '15778', '0,1900');
UPDATE itens_modelo SET valor_unitario='4,82' WHERE id_item_modelo=443;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('444', 'ITM000444', 'Ponto de dreno p/ split (10m)', '0,00', '26', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('444', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('444', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=444;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('445', 'ITM000445', 'Conjunto airstop de embutir completo', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('445', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('445', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=445;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('446', 'ITM000446', 'Aparelho air-split - 12.000 btus', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('446', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('446', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=446;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('447', 'ITM000447', 'Aparelho air-split - 18.000 btus', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('447', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('447', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=447;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('448', 'ITM000448', 'Guarda-corpo em tubo de aço galvanizado 1 1/2', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('448', '241', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('448', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='20,08' WHERE id_item_modelo=448;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('449', 'ITM000449', 'Tampo em granito verde ubatuba', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('449', '6', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('449', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='11,52' WHERE id_item_modelo=449;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('450', 'ITM000450', 'Seixo com espalhamento', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('450', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='9,20' WHERE id_item_modelo=450;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('451', 'ITM000451', 'Muro em alvenaria,rebocado e pintado 2 faces(h=2.0m)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('451', '6', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('451', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='14,41' WHERE id_item_modelo=451;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('452', 'ITM000452', 'Banco em madeira de lei c=1,8m, l=0,4m e h=0,4m', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('452', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='9,20' WHERE id_item_modelo=452;

UPDATE itens_modelo SET valor_unitario='0,00' WHERE id_item_modelo=452;



-- arquivo 10.txt *************************** FIM

-- arquivo 11.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('453', 'ITM000453', 'Barracão de obra', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '215', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '216', '1,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '217', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '218', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '219', '0,3860');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '220', '0,2140');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '221', '0,0057');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '222', '0,7000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '224', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '225', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '226', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '227', '0,3180');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '228', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '229', '0,0115');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '230', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '462', '0,3030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '232', '1,2800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '233', '0,0346');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '234', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '235', '0,5360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '236', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '237', '0,0220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '238', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '239', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '240', '0,0240');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('453', '2', '2,6580');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '241', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '13758', '0,0090');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '242', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('453', '15778', '4,3400');
UPDATE itens_modelo SET valor_unitario='124,93' WHERE id_item_modelo=453;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('454', 'ITM000454', 'Ligação provisória de água', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('454', '465', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('454', '15253', '0,9000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('454', '2', '0,9000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('454', '5', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('454', '15778', '1,7160');
UPDATE itens_modelo SET valor_unitario='218,68' WHERE id_item_modelo=454;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('455', 'ITM000455', 'Ligação provisória de energia', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('455', '213', '1,00');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('455', '13758', '16,00');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('455', '5', '3,00');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('455', '15778', '16,00');
UPDATE itens_modelo SET valor_unitario='1.036,84' WHERE id_item_modelo=455;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('456', 'ITM000456', 'Ligação provisórias de esgoto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('456', '214', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('456', '15253', '4,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('456', '2', '4,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('456', '5', '4,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('456', '15778', '6,0600');
UPDATE itens_modelo SET valor_unitario='998,37' WHERE id_item_modelo=456;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('457', 'ITM000457', 'Locação da obra - execução de gabarito', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('457', '243', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('457', '26', '0,0360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('457', '28', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('457', '230', '0,0320');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('457', '2', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('457', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,67' WHERE id_item_modelo=457;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('458', 'ITM000458', 'Placa da obra - padrão governo federal', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('458', '453', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('458', '454', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('458', '456', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('458', '224', '0,1100');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('458', '2', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('458', '15778', '2,0000');
UPDATE itens_modelo SET valor_unitario='233,95' WHERE id_item_modelo=458;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('459', 'ITM000459', 'Escavação manual de valas até a profundidade de 1 metro', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('459', '15778', '2,4030');
UPDATE itens_modelo SET valor_unitario='22,10' WHERE id_item_modelo=459;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('460', 'ITM000460', 'Reaterro com apiloamento', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('460', '467', '0,3400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('460', '15778', '3,4030');
UPDATE itens_modelo SET valor_unitario='33,33' WHERE id_item_modelo=460;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('461', 'ITM000461', 'Aterro interno com apiloamento', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('461', '467', '0,3400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('461', '15778', '3,9010');
UPDATE itens_modelo SET valor_unitario='37,91' WHERE id_item_modelo=461;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('462', 'ITM000462', 'Embassamento c/tijolo comum', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('462', '15253', '9,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('462', '15778', '9,5000');
UPDATE itens_modelo SET valor_unitario='208,43' WHERE id_item_modelo=462;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('463', 'ITM000463', 'Estaca a trado diam. 30 cm com inclusive ferragem', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '25', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '26', '0,2850');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '469', '0,2700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '29', '0,4950');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('463', '2', '2,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('463', '15778', '3,1000');
UPDATE itens_modelo SET valor_unitario='42,63' WHERE id_item_modelo=463;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('464', 'ITM000464', 'Escavação manual de valas (sapatas/blocos)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('464', '15778', '5,2850');
UPDATE itens_modelo SET valor_unitario='48,62' WHERE id_item_modelo=464;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('465', 'ITM000465', 'Reaterro c/ apiloamento (blocos/sapatas)', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('465', '467', '0,3400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('465', '15778', '3,4030');
UPDATE itens_modelo SET valor_unitario='33,33' WHERE id_item_modelo=465;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('466', 'ITM000466', 'Escavação tubulões a céu aberto - (obras civis)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('466', '15778', '1,0880');
UPDATE itens_modelo SET valor_unitario='10,00' WHERE id_item_modelo=466;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('467', 'ITM000467', 'Concreto simples para lastro', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('467', '15253', '1,3980');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('467', '15778', '1,0010');
UPDATE itens_modelo SET valor_unitario='27,01' WHERE id_item_modelo=467;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('468', 'ITM000468', 'Concreto armado fck=20 mpa,usinado,bombeado, lançado e adensado, para uso geral, inclusive formas.', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('468', '471', '2,3300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('468', '472', '0,4000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('468', '11', '0,4000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('468', '2', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('468', '15253', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('468', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='476,64' WHERE id_item_modelo=468;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('469', 'ITM000469', 'Fundação em pedra rachão', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '15778', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '25', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '26', '0,2750');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '27', '0,2400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '29', '0,7920');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('469', '2', '0,9000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('469', '15778', '0,2250');
UPDATE itens_modelo SET valor_unitario='8,30' WHERE id_item_modelo=469;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('470', 'ITM000470', 'Forro de laje pre-moldada, inclusive capeamento (e=2cm) c/ ferr. distrib.', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('470', '2', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('470', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='1,44' WHERE id_item_modelo=470;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('471', 'ITM000471', 'Arandela a prova de intempéries, c/grade met.sup.90 gr<100w', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('471', '13758', '0,6400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('471', '15778', '0,6400');
UPDATE itens_modelo SET valor_unitario='14,03' WHERE id_item_modelo=471;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('472', 'ITM000472', 'Bandeja para rack de telecomunicações 1u', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('472', '13758', '0,6400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('472', '15778', '0,6400');
UPDATE itens_modelo SET valor_unitario='14,03' WHERE id_item_modelo=472;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('473', 'ITM000473', 'Base p/ globo ou drops ( 1 lâmpada ) boca 10 cmcls', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('473', '13758', '0,6600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('473', '15778', '0,6600');
UPDATE itens_modelo SET valor_unitario='14,47' WHERE id_item_modelo=473;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('474', 'ITM000474', 'Bloco ber - 10 ( bloco de engate rápido)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('474', '13758', '0,6600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('474', '15778', '0,6600');
UPDATE itens_modelo SET valor_unitario='14,47' WHERE id_item_modelo=474;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('475', 'ITM000475', 'Cabeçote de liga de alumínio diam. 3', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('475', '13758', '0,6600');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('475', '15778', '0,6600');
UPDATE itens_modelo SET valor_unitario='14,47' WHERE id_item_modelo=475;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('476', 'ITM000476', 'Cabo de cobre nu no. 10 mm² (11,11m /kg)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('476', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('476', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=476;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('477', 'ITM000477', 'Cabo de cobre nu no. 35 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('477', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('477', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=477;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('478', 'ITM000478', 'Cabo flexível isolado 1 kv 10 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('478', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('478', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=478;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('479', 'ITM000479', 'Cabo flexível isolado 1 kv 16 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('479', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('479', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=479;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('480', 'ITM000480', 'Cabo flexível isolado 1 kv 2,5 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('480', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('480', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=480;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('481', 'ITM000481', 'Cabo flexível isolado 1 kv 35 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('481', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('481', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=481;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('482', 'ITM000482', 'Cabo flexível isolado 1 kv 4 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('482', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('482', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=482;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('483', 'ITM000483', 'Cabo flexível isolado 1 kv 6 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('483', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('483', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=483;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('484', 'ITM000484', 'Cabo flexível isolado 1 kv 95 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('484', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('484', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=484;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('485', 'ITM000485', 'Cabo flexível isolado 750v 2,5 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('485', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('485', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=485;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('486', 'ITM000486', 'Cabo flexível isolado 750v 4 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('486', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('486', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=486;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('487', 'ITM000487', 'Cabo flexível isolado 750v 6 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('487', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('487', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=487;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('488', 'ITM000488', 'Cabo isolado pp 3 x 4,0 mm²', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('488', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('488', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=488;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('489', 'ITM000489', 'Cabo lógico stp-4pares categoria 5e', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('489', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('489', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=489;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('490', 'ITM000490', 'Cabo telefônico cce-50-4 pares', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('490', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('490', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=490;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('491', 'ITM000491', 'Cabo telefônico ci-50- 10 pares ( uso interno)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('491', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('491', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=491;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('492', 'ITM000492', 'Cabo utp-4p, cat. 5e, 24 awg', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('492', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('492', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=492;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('493', 'ITM000493', 'Caixa de passagem metálica 15x15x12 cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('493', '13758', '1,2300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('493', '15778', '1,2300');
UPDATE itens_modelo SET valor_unitario='26,98' WHERE id_item_modelo=493;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('494', 'ITM000494', 'Caixa distribuição telefônica 40x40x12 cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('494', '13758', '1,2300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('494', '15778', '1,2300');
UPDATE itens_modelo SET valor_unitario='26,98' WHERE id_item_modelo=494;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('495', 'ITM000495', 'Caixa distribuição telefônica 60x60x12 cm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('495', '13758', '1,2300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('495', '15778', '1,2300');
UPDATE itens_modelo SET valor_unitario='26,98' WHERE id_item_modelo=495;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('496', 'ITM000496', 'Caixa met. hexagonal p/arandela (sextavada 3x3)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('496', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('496', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=496;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('497', 'ITM000497', 'Caixa de pvc octogonal fundo móvel, dupla 4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('497', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('497', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=497;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('498', 'ITM000498', 'Caixa pvc quadrada 4x4x2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('498', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('498', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=498;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('499', 'ITM000499', 'Caixa pvc 4 x 2 x 2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('499', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('499', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=499;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('500', 'ITM000500', 'Caixa passagem 20x20x25 fundo brita s/tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('500', '13758', '0,1700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('500', '15778', '0,1700');
UPDATE itens_modelo SET valor_unitario='3,72' WHERE id_item_modelo=500;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('501', 'ITM000501', 'Caixa passagem 35x60x50 fundo de conc. (p/tampa r1)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('501', '13758', '3,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('501', '15778', '3,3000');
UPDATE itens_modelo SET valor_unitario='72,40' WHERE id_item_modelo=501;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('502', 'ITM000502', 'Caixa passagem 50x50x60 fundo de brita s/tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('502', '13758', '3,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('502', '15778', '3,3000');
UPDATE itens_modelo SET valor_unitario='72,40' WHERE id_item_modelo=502;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('503', 'ITM000503', 'Certificado digital', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('504', 'ITM000504', 'Condulete pvc ib 3/4 s/ tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('504', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('504', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=504;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('505', 'ITM000505', 'Condulete pvc t 3/4 s/ tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('505', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('505', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=505;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('506', 'ITM000506', 'Condulete pvc x 3/4 s/ tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('506', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('506', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=506;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('507', 'ITM000507', 'Convesor de fibra óptica para cabo utp', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('507', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('507', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=507;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('508', 'ITM000508', 'Disjuntor monopolar de 10 a 30-a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('508', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('508', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=508;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('509', 'ITM000509', 'Disjuntor tripolar de 40 a 50-a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('509', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('509', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=509;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('510', 'ITM000510', 'Disjuntor tripolar de 10 a 35-a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('510', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('510', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=510;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('511', 'ITM000511', 'Disjuntor tripolar de 200-a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('511', '13758', '2,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('511', '15778', '2,3000');
UPDATE itens_modelo SET valor_unitario='50,46' WHERE id_item_modelo=511;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('512', 'ITM000512', 'Disjuntor diferencial residual 25a, 30 ma', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('512', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('512', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=512;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('513', 'ITM000513', 'Dispositivo interno óptico 1 u para rack', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('513', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('513', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=513;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('514', 'ITM000514', 'Eletroduto de pvc rigido diâmetro 1 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('514', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('514', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=514;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('515', 'ITM000515', 'Eletroduto de pvc rigido diâmetro 2 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('515', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('515', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=515;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('516', 'ITM000516', 'Eletroduto de pvc rigido diâmetro 3 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('516', '13758', '0,4000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('516', '15778', '0,4000');
UPDATE itens_modelo SET valor_unitario='8,77' WHERE id_item_modelo=516;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('517', 'ITM000517', 'Eletroduto de pvc rigido diâmetro 3/4 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('517', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('517', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=517;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('518', 'ITM000518', 'Eletroduto de pvc rigido diâmetro 4 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('518', '13758', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('518', '15778', '1,1000');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=518;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('519', 'ITM000519', 'Eletroduto de ferro galvanizado diâmetro 3 inclusive conexões', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('519', '13758', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('519', '15778', '1,1000');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=519;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('520', 'ITM000520', 'Espelho baquelite 4 x 2 2 furos rj-45', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('520', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('520', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=520;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('521', 'ITM000521', 'Fibra óptica monomodo geleado', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('521', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('521', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=521;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('522', 'ITM000522', 'Fio de cobre nu no. 6 mm² (18,00 m/kg)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('522', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('522', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=522;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('523', 'ITM000523', 'Haste copperweld 5/8 x 3,00 m c/ conector', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('523', '13758', '1,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('523', '15778', '1,3000');
UPDATE itens_modelo SET valor_unitario='28,52' WHERE id_item_modelo=523;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('524', 'ITM000524', 'Interruptor paralelo simples (1 seção)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('524', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('524', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=524;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('525', 'ITM000525', 'Interruptor simples (1 seção)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('525', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('525', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=525;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('526', 'ITM000526', 'Interruptor simples (2 seção)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('526', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('526', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=526;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('527', 'ITM000527', 'Interruptor simples (3 seção)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('527', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('527', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=527;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('528', 'ITM000528', 'Interruptor simples 1 tomada univ. conjugados', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('528', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('528', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=528;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('529', 'ITM000529', 'Line cord up - 4p, cat. 5 e, flexivel, 2,0 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('529', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('529', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=529;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('530', 'ITM000530', 'Luminaria circular com vidro p/quadr 400 w, p/base e-40', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('530', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('530', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=530;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('531', 'ITM000531', 'Luminaria conj.c/1 pétala simpl. (ate 400 w) padrão b', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('531', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('531', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=531;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('532', 'ITM000532', 'Luminaria fluorescente de embutir 2 x 32 ou 2 x 40 w, completa, reator eletrônico e lâmpada conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('532', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('532', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=532;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('533', 'ITM000533', 'Organizador de cabos (guias)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('533', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('533', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=533;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('534', 'ITM000534', 'Patch cord utp-4 p, cat 5e, flexível 2,0 m', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('534', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('534', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=534;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('535', 'ITM000535', 'Patch pannel padrão 19 cat. 5e, com 24 portas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('535', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('535', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=535;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('536', 'ITM000536', 'Petrolet c 1 s/tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('536', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('536', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=536;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('537', 'ITM000537', 'Petrolet c 3/4 s/tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('537', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('537', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=537;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('538', 'ITM000538', 'Petrolet ii, ir ou ib 1 s/tampa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('538', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('538', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=538;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('539', 'ITM000539', 'Poste circular em fº gº d=100/60mm e h= 12 m)', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('539', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('539', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=539;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('540', 'ITM000540', 'Poste de concreto quad. 10 cm lado c/2,5 metros de comp.', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('540', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('540', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=540;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('541', 'ITM000541', 'Projetor circular( ate 200 w) base e-27 completo inclusive lâmpada, conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('541', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('541', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=541;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('542', 'ITM000542', 'Projetor retangular c/ porta ( ate 400w) base e40 completo lãmpada, conforme projeto', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('542', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('542', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=542;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('543', 'ITM000543', 'Quadro de distribuição cb 12e - 100a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('543', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('543', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=543;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('544', 'ITM000544', 'Quadro de distribuição cb 12e - 150a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('544', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('544', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=544;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('545', 'ITM000545', 'Quadro de distribuição cb 18e - 150a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('545', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('545', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=545;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('546', 'ITM000546', 'Quadro de distribuição cb 50e - 225a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('546', '13758', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('546', '15778', '1,1000');
UPDATE itens_modelo SET valor_unitario='24,13' WHERE id_item_modelo=546;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('547', 'ITM000547', 'Rack de telecomunicações fechado em acrilico 19 12us', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('547', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('547', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=547;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('548', 'ITM000548', 'Rack de telecomunicações fechado em acrilico 19 40us', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('548', '13758', '1,2000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('548', '15778', '1,2000');
UPDATE itens_modelo SET valor_unitario='26,32' WHERE id_item_modelo=548;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('549', 'ITM000549', 'Régua com 8 tomadas', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('549', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('549', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=549;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('550', 'ITM000550', 'Rele foto elétrico com base', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('550', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('550', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=550;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('551', 'ITM000551', 'Switch 24 portas 10/100mbps', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('551', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('551', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=551;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('552', 'ITM000552', 'Tampa cega condulete pvc 1', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('552', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('552', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=552;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('553', 'ITM000553', 'Tampa cega petrolet 1', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('553', '13758', '0,0800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('553', '15778', '0,0800');
UPDATE itens_modelo SET valor_unitario='1,74' WHERE id_item_modelo=553;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('554', 'ITM000554', 'Tampa concreto e=5 cm p/cx. passagem', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('554', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('554', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=554;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('555', 'ITM000555', 'Tampa de ferro fundido r1 com base', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('555', '13758', '0,0900');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('555', '15778', '0,0900');
UPDATE itens_modelo SET valor_unitario='1,96' WHERE id_item_modelo=555;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('556', 'ITM000556', 'Tampa de pvc 4 x 2 com furo central', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('556', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('556', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=556;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('557', 'ITM000557', 'Tampa de pvc 4 x 2 x 2 com furo central', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('557', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('557', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=557;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('558', 'ITM000558', 'Tomada de 2 pólos mais terra', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('558', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('558', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=558;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('559', 'ITM000559', 'Tomada de 3 pólos mais terra', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('559', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('559', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=559;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('560', 'ITM000560', 'Tomada lógica rj-45 tipo keystone jack, cat. 5e', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('560', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('560', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=560;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('561', 'ITM000561', 'Tomada universal', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('561', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('561', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=561;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('562', 'ITM000562', 'Ventilador para rack', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('562', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('562', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,09' WHERE id_item_modelo=562;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('563', 'ITM000563', 'Caixa de inspeção de aterramento 250x250x250mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('563', '6', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('563', '13758', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('563', '15778', '0,0500');
UPDATE itens_modelo SET valor_unitario='1,35' WHERE id_item_modelo=563;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('564', 'ITM000564', 'Caixa de passagem em alvenaria 500x500x800mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('564', '6', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('564', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('564', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='21,71' WHERE id_item_modelo=564;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('565', 'ITM000565', 'Caixa para medidor trifásico padrão concessionaria local', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('565', '6', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('565', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('565', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='21,71' WHERE id_item_modelo=565;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('566', 'ITM000566', 'Chave fusível, 15 kv, 100a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('566', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('566', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=566;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('567', 'ITM000567', 'Cruzeta de concreto armado 1900mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('567', '6', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('567', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('567', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='21,71' WHERE id_item_modelo=567;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('568', 'ITM000568', 'Curva de 90 graus de pvc rigido diam. 4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('568', '6', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('568', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('568', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='21,71' WHERE id_item_modelo=568;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('569', 'ITM000569', 'Disjuntor termomagnético tripolar 200a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('569', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('569', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=569;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('570', 'ITM000570', 'Eletroduto de pvc rigido diâmetro 4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('570', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('570', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=570;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('571', 'ITM000571', 'Elo fusivel 6k', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('571', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('571', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=571;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('572', 'ITM000572', 'Isolador polietileno de ancoragem', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('572', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('572', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=572;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('573', 'ITM000573', 'Isolador tipo roldana de porcelana', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('573', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('573', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=573;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('574', 'ITM000574', 'Isolador, pino 15 kv rosca 25 mm', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('574', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('574', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=574;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('575', 'ITM000575', 'Para raios distribuição, vávula bloco 12 kv, 5 kva', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('575', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('575', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=575;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('576', 'ITM000576', 'Poste de concreto sc 11/400', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('576', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('576', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=576;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('577', 'ITM000577', 'Suporte p/ transformador em poste duplo t', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('577', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('577', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=577;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('578', 'ITM000578', 'Transformador trifasico 112,5 kva', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('578', '13758', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('578', '15778', '0,8000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=578;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('579', 'ITM000579', 'Alvenaria de tijolo comum 1/2 vez', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('579', '15294', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('579', '15253', '1,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('579', '15778', '0,6850');
UPDATE itens_modelo SET valor_unitario='26,91' WHERE id_item_modelo=579;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('580', 'ITM000580', 'Alvenaria de tijolo comum 1/4 vez', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('580', '15294', '0,0050');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('580', '15253', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('580', '15778', '0,5000');
UPDATE itens_modelo SET valor_unitario='18,84' WHERE id_item_modelo=580;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('581', 'ITM000581', 'Elemento vazado de concreto', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('581', '258', '0,0088');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('581', '15253', '1,0000');
UPDATE itens_modelo SET valor_unitario='13,28' WHERE id_item_modelo=581;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('582', 'ITM000582', 'Vidro liso 3 mm', '0,00', '1', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('582', '241', '0,0300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('582', '7', '0,0300');
UPDATE itens_modelo SET valor_unitario='0,43' WHERE id_item_modelo=582;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('583', 'ITM000583', 'Cobertura com telha colonial-plan', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('583', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('583', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='17,55' WHERE id_item_modelo=583;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('584', 'ITM000584', 'Cumeeira para telha colonial-plan', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('584', '14953', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('584', '15778', '0,1500');
UPDATE itens_modelo SET valor_unitario='3,88' WHERE id_item_modelo=584;



-- arquivo 11.txt *************************** FIM

-- arquivo 12.txt *************************** INICIO

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('585', 'ITM000585', 'Tapume de chapa de madeira compensada com 6mm, com altura 2,20m', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '245', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '246', '0,2273');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '455', '1,5800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '247', '0,2200');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('585', '2', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '15300', '0,4880');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('585', '15778', '0,3500');
UPDATE itens_modelo SET valor_unitario='25,01' WHERE id_item_modelo=585;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('586', 'ITM000586', 'Barracões provisórios', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '215', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '216', '1,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '217', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '218', '0,0150');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '219', '0,3860');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '220', '0,2140');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '221', '0,0057');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '222', '0,7000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '224', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '225', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '226', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '227', '0,3180');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '228', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '229', '0,0115');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '230', '0,2500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '462', '0,3030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '232', '1,2800');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '233', '0,0346');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '234', '0,0058');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '235', '0,5360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '236', '0,0230');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '237', '0,0220');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '238', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '239', '0,0461');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '240', '0,0240');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('586', '2', '6,3030');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '241', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '242', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('586', '15778', '7,3400');
UPDATE itens_modelo SET valor_unitario='171,71' WHERE id_item_modelo=586;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('587', 'ITM000587', 'Locação de construção com gabarito de madeira', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('587', '243', '0,0200');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('587', '26', '0,0360');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('587', '28', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('587', '230', '0,0320');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('587', '2', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('587', '15778', '0,1141');
UPDATE itens_modelo SET valor_unitario='2,79' WHERE id_item_modelo=587;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('588', 'ITM000588', 'Ligação provisória de energia elétrica em baixa tensão', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('588', '213', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('588', '13758', '16,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('588', '5', '3,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('588', '15778', '16,0000');
UPDATE itens_modelo SET valor_unitario='1.036,84' WHERE id_item_modelo=588;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('589', 'ITM000589', 'Sondagem do terreno ( um furo de 1m a cada 200 m²)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('589', '244', '1,0000');
UPDATE itens_modelo SET valor_unitario='59,88' WHERE id_item_modelo=589;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('590', 'ITM000590', 'Limpeza do terreno com remoção da camada vegetal', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('590', '466', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('590', '15778', '0,0090');
UPDATE itens_modelo SET valor_unitario='0,47' WHERE id_item_modelo=590;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('591', 'ITM000591', 'Escavação manual de valas em qualquer terreno exceto rocha até h=1,50 m', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('591', '15778', '4,0629');
UPDATE itens_modelo SET valor_unitario='37,37' WHERE id_item_modelo=591;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('592', 'ITM000592', 'Regularização e compactação do fundo de valas', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('592', '467', '0,3400');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('592', '15778', '1,5221');
UPDATE itens_modelo SET valor_unitario='16,03' WHERE id_item_modelo=592;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('593', 'ITM000593', 'Reaterro apiloado de vala com material da obra', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('593', '467', '0,0610');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('593', '15778', '4,6032');
UPDATE itens_modelo SET valor_unitario='42,70' WHERE id_item_modelo=593;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('594', 'ITM000594', 'Estaca a trado (broca) d=25 cm com concreto fck=15 mpa (sem armação)', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('594', '215', '0,0500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('594', '15253', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('594', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='36,01' WHERE id_item_modelo=594;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('595', 'ITM000595', 'Lastro de concreto magro (e=3,0 cm) - preparo mecânico', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('595', '468', '0,0300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('595', '15253', '0,4670');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('595', '15778', '0,5500');
UPDATE itens_modelo SET valor_unitario='16,98' WHERE id_item_modelo=595;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('596', 'ITM000596', 'Forma de madeira comum para fundações - reaproveitamento 5x', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '25', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '26', '0,2850');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '469', '0,2700');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '28', '0,1500');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '29', '0,4950');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('596', '2', '0,8000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('596', '15778', '0,4400');
UPDATE itens_modelo SET valor_unitario='9,81' WHERE id_item_modelo=596;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('597', 'ITM000597', 'Armação aço ca-50, diam. 6,3 (1/4) á 12,5mm(1/2) - fornecimento / corte perda de 10%) / dobra / colocação.', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('597', '470', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('597', '243', '0,0300');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('597', '11', '0,1490');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('597', '7', '0,1000');
UPDATE itens_modelo SET valor_unitario='5,42' WHERE id_item_modelo=597;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('598', 'ITM000598', 'Armação de aço ca-60 diam. 3,4 a 6,0mm-fornecimento/corte perda de 10%) / dobra / colocação.', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('598', '254', '1,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('598', '243', '0,0200');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('598', '11', '0,1270');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('598', '7', '0,0800');
UPDATE itens_modelo SET valor_unitario='12,64' WHERE id_item_modelo=598;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('599', 'ITM000599', 'Concreto para fundação fck=25mpa, incluindo preparo, lançamento, adensamento.', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('599', '471', '2,3300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('599', '472', '0,3000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('599', '11', '0,6000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('599', '2', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('599', '15253', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('599', '15778', '0,6000');
UPDATE itens_modelo SET valor_unitario='492,50' WHERE id_item_modelo=599;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('600', 'ITM000600', 'Estrutura metálica, em arco, vão de 16,70 m, inclui pintura', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('600', '473', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('600', '241', '1,5000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('600', '7', '1,0000');
UPDATE itens_modelo SET valor_unitario='63,57' WHERE id_item_modelo=600;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('601', 'ITM000601', 'Concreto estrutural fck 20 mpa, usinado, iclui lançamento (enchimento pilares)', '0,00', '15', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('601', '474', '2,3300');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('601', '472', '0,3000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('601', '11', '0,6000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('601', '2', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('601', '15253', '0,6000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('601', '15778', '0,6000');
UPDATE itens_modelo SET valor_unitario='476,00' WHERE id_item_modelo=601;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('602', 'ITM000602', 'Telha de aço galvanizado ondulada 0,5 mm, inclui pintura - cobertura em arco', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('602', '475', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('602', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('602', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='50,08' WHERE id_item_modelo=602;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('603', 'ITM000603', 'Telha de aço galvanizado ondulada 0,5 mm, cor natural- fechamento lateral', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('603', '476', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('603', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('603', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='50,08' WHERE id_item_modelo=603;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('604', 'ITM000604', 'Telha de aço galvanizado ondulada 0,5 mm, inclui pintura cor branca - fechameno lateral', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('604', '477', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('604', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('604', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='67,29' WHERE id_item_modelo=604;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('605', 'ITM000605', 'Telha ondulada translúcida fibra vidro de 0,5 mm, inclui pintura', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('605', '478', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('605', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('605', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='36,57' WHERE id_item_modelo=605;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('606', 'ITM000606', 'Calha em chapa metalica nº 24', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('606', '479', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('606', '14953', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('606', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='41,99' WHERE id_item_modelo=606;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('607', 'ITM000607', 'Tubo de queda - água pluvial dn= 150 mm', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('607', '480', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('607', '5', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('607', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='34,17' WHERE id_item_modelo=607;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('608', 'ITM000608', 'Joelho pvc 90° d= 150 mm - tubulação pluvial', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('608', '481', '1,0000');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('608', '5', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('608', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='50,64' WHERE id_item_modelo=608;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('609', 'ITM000609', 'Ralo hemisférico tipo abacaxi com tela de aço com funil de saída cônico', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_mao_obra_modelo (fk_item, fk_mao_obra, quantidade) values ('609', '5', '0,5000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('609', '15778', '1,0000');
UPDATE itens_modelo SET valor_unitario='11,80' WHERE id_item_modelo=609;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('610', 'ITM000610', 'Luva de aço galvanizado 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('610', '483', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('610', '13758', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('610', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='10,62' WHERE id_item_modelo=610;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('611', 'ITM000611', 'Luva de aço galvanizado 1', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('611', '484', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('611', '13758', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('611', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='13,15' WHERE id_item_modelo=611;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('612', 'ITM000612', 'Condulete em aluminio tipo lb de 3/4, inclusive acessorios', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('612', '485', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('612', '13758', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('612', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='13,01' WHERE id_item_modelo=612;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('613', 'ITM000613', 'Condulete em aluminio tipo xa de 3/4, inclusive acessorios', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('613', '486', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('613', '13758', '0,3000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('613', '15778', '0,3000');
UPDATE itens_modelo SET valor_unitario='23,71' WHERE id_item_modelo=613;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('614', 'ITM000614', 'Abraçadeira metálica tipo d de 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('614', '488', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('614', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('614', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='0,87' WHERE id_item_modelo=614;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('615', 'ITM000615', 'Abraçadeira metálica tipo d de 1', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('615', '489', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('615', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('615', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='1,21' WHERE id_item_modelo=615;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('616', 'ITM000616', 'Abraçadeira de ferro modular tipo dupla u', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('616', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('616', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='0,21' WHERE id_item_modelo=616;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('617', 'ITM000617', 'Condutor unipolar (cobre) isolação pvc/70°c 2,5 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('617', '491', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('617', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('617', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='2,50' WHERE id_item_modelo=617;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('618', 'ITM000618', 'Condutor unipolar (cobre) isolação pvc/70°c 4,0 mm²', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('618', '492', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('618', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('618', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='3,71' WHERE id_item_modelo=618;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('619', 'ITM000619', 'Disjuntor unipolar termomagnético 10 a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('619', '484', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('619', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('619', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='6,78' WHERE id_item_modelo=619;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('620', 'ITM000620', 'Disjuntor bipolar termomagnético 20 a', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('620', '493', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('620', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('620', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='43,29' WHERE id_item_modelo=620;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('621', 'ITM000621', 'Disjuntor tripolar termomagnético 40 a - 5 ka', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('621', '494', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('621', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('621', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='43,29' WHERE id_item_modelo=621;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('622', 'ITM000622', 'Eletroduto aço galvanizado de 1 1/2', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('622', '495', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('622', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('622', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='27,56' WHERE id_item_modelo=622;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('623', 'ITM000623', 'Eletroduto aço galvanizado de 3/4', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('623', '496', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('623', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('623', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='16,08' WHERE id_item_modelo=623;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('624', 'ITM000624', 'Luminária industrial de aluminio, refletor 17, soqueteira cilíndrica com gradil de aramado protetor, completa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('624', '497', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('624', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('624', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='555,02' WHERE id_item_modelo=624;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('625', 'ITM000625', 'Quadro distribuição chapa pintada sobrepor - completo, com porta tranca e acessórios - cap. 7 disjuntores', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('625', '498', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('625', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('625', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='214,94' WHERE id_item_modelo=625;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('626', 'ITM000626', 'Tomada universal, 2p+t, 20a/250v, completa', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('626', '499', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('626', '13758', '0,0100');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('626', '15778', '0,0100');
UPDATE itens_modelo SET valor_unitario='17,76' WHERE id_item_modelo=626;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('627', 'ITM000627', 'Caixa de inspeção 30x30 com tampa de ferro fundido', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('627', '500', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('627', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('627', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='135,64' WHERE id_item_modelo=627;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('628', 'ITM000628', 'Conector de bronze para haste de 5/8', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('628', '501', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('628', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('628', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='43,92' WHERE id_item_modelo=628;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('629', 'ITM000629', 'Cordoalha de cobre nu 35 mm2', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('629', '502', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('629', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('629', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='33,83' WHERE id_item_modelo=629;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('630', 'ITM000630', 'Tubo pvc 2', '0,00', '2', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('630', '503', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('630', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('630', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='9,44' WHERE id_item_modelo=630;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('631', 'ITM000631', 'Terminal de pressão tipo prensa com 4 parafusos', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('631', '504', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('631', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('631', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='24,14' WHERE id_item_modelo=631;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('632', 'ITM000632', 'Haste tipo coopperweld 5/8 x 3m.', '0,00', '17', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('632', '505', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('632', '13758', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('632', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='43,92' WHERE id_item_modelo=632;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('633', 'ITM000633', 'Pintura em superfície de concreto, cor amarelo', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('633', '506', '1,0000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('633', '15300', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('633', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='31,47' WHERE id_item_modelo=633;

insert into itens_modelo (id_item_modelo, codigo, descricao, valor_unitario, fk_unidade, status,sem_insumos, tipo) values ('634', 'ITM000634', 'Impermeabilização com tinta betuminosa em fundações, baldrames', '0,00', '7', 'ATIVO', 'NAO', 'NORMAL');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('634', '15300', '0,1000');
insert into item_modelo_x_material_modelo (fk_item, fk_material, quantidade) values ('634', '15778', '0,1000');
UPDATE itens_modelo SET valor_unitario='2,19' WHERE id_item_modelo=634;
