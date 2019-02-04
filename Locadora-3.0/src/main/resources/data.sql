insert into locadora(id, empresa, rua, numero, bairro, cidade, estado) values (1,'RBS Locação', 'Vereador Jose', 587, 'São Luiz', 'Lagoa da Canoa', 'AL')
insert into funcionario(id, funcao, codigo, nome, Funcionarios_Id) values (1, 'Caixa 1', 2565, 'Carlos Barbosa', 1)


insert into cliente_comum(id, nome, telefone, Clientes_Id) values (1, 'Luiz de Melo', '8565-2545', 1)
insert into cliente_comum(id, nome, telefone, Clientes_Id) values (2, 'Renata Santos ', '8525-4520', 1)
insert into cliente_comum(id, nome, telefone, Clientes_Id) values (3, 'Leandro Santos ', '9965-8541', 1)
insert into cliente_comum(id, nome, telefone, Clientes_Id) values (4, 'Rafaela Batista', '9986-4625', 1)


insert into filme(id, categoria, titulo, date_De_Lancamento, Filmes_Id) values (1,'Ação, Aventura, Ficção científica', 'Homem de Ferro', '30 de abril de 2008', 1)
insert into filme(id, categoria, titulo, date_De_Lancamento, Filmes_Id) values (2,'Ação, Aventura, Ficção científica', 'Capitão América: O Primeiro Vingador', '29 de julho de 2011', 1)
insert into filme(id, categoria, titulo, date_De_Lancamento, Filmes_Id) values (3,'Ação, Aventura, Ficção científica', 'Os Vingadores', '27 de abril de 2012', 1)
insert into filme(id, categoria, titulo, date_De_Lancamento, Filmes_Id) values (4,'Ação, Aventura, Ficção científica', 'Capitão América: Guerra Civil', '28 de abril de 2016', 1)
insert into filme(id, categoria, titulo, date_De_Lancamento, Filmes_Id) values (5,'Ação, Aventura, Ficção científica', 'Vingadores: Ultimato ', '25 de abril de 2019', 1)


insert into emprestimo (id, cliente_Locacao, data_dev, data_emp, filmes_Emprestados, Emprestimo_Id) values (4, 'Rafaela Batista', '25-02-2019', '02-02-2019', 'Homem de Ferro, Os Vingadores ',4 )
insert into emprestimo (id, cliente_Locacao, data_dev, data_emp, filmes_Emprestados, Emprestimo_Id) values (2, 'Renata Santos', '23-02-2019', '01-01-2019', 'Os Vingadores', 2 )
insert into emprestimo (id, cliente_Locacao, data_dev, data_emp, filmes_Emprestados, Emprestimo_Id) values (1, 'Luiz de Melo', '25-03-2019', '10-01-2019', 'Capitão América: Guerra Civil', 1 )


insert into reserva (id, filme_Desejado, data_Reserva, Reserva_Id) values (3,'Vingadores: Ultimato', '26-04-2019', 3 )