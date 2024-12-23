# Explore With Me
_Свободное время — ценный ресурс. Ежедневно мы планируем, как его потратить — куда и с кем сходить. Сложнее всего в таком планировании поиск информации и переговоры. Нужно учесть много деталей: какие намечаются мероприятия, свободны ли в этот момент друзья, как всех пригласить и где собраться.
Приложение, которое вы будете создавать, — афиша. В этой афише можно предложить какое-либо событие от выставки до похода в кино и собрать компанию для участия в нём._

Данное приложение — афиша. В этой афише можно предложить какое-либо событие от выставки до похода в кино и собрать компанию для участия в нём.

## Сервис статистики (stat_svc)
#### Функционал:

- Создание запроса о посещении и сохранение в базу данных;
- Создание статистики на основе данных о посещениях.

## Основной сервис (main_svc)
#### API главного сервиса делится на три части:

- **публичная часть** доступна без регистрации любому пользователю сети;
- **закрытая часть** доступна только авторизованным пользователям;
- **административная часть** доступна только для администраторов сервиса.

### Публичный API
#### Events(события):
При каждом вызове публичного API собираются статистические данные и отправляются в сервис статистики(stats-service)
- Получение событий с возможностью фильтрации;
- Получение подробной информации об опубликованном событии по его идентификатору.
#### Category(категории):
- Получение всех категорий;
- Получение информации о категории по ее идентификатору.
#### Compilations(подборка событий):
- Получение подборок событий;
- Получение подборки событий по ее идентификатору.
### Административный API:
#### Users(пользователи):
- Получение информации о пользователях;
- Добавление нового пользователя;
- Удаление пользователя.
#### Compilations(подборка событий):
- Добавление новой подборки;
- Удаление подборки;
- Обновление информации о подборке.
#### Events(события):
- Поиск событий;
- Редактирование данных события и его статуса(отклонение/публикация).
#### Category(категории):
- Добавление новой категории;
- Удаление категории;
- Изменение категории.
### Закрытый API
#### Events(события):
- Получение событий, добавленных текущим пользователем;
- Добавление нового события;
- Получение полной информации о событии добавленном текущим пользователем;
- Изменение события добавленного текущим пользователем;
- Получение информации о запросах на участие в событии текущего пользователя;
- Изменение статуса (подтверждена, отменена) заявок на участие в событии текущего пользователя.
#### Requests(запросы на участие):
- Получение информации о заявках текущего пользователя на участие в чужих событиях;
- Добавление запроса от текущего пользователя на участие в событии;
- Отмена своего запроса на участие в событии.

## Дополнительный функционал (feature_rating_events)
### PR :https://github.com/Evstigneev-AS/java-explore-with-me/pull/3
### Функционал:
- Возможность оценить событие по 5 бальной шкале;
- Удаление оценки;
- Получение оценок поставленных одним пользователем(Сортировка по актуальности);
- Получение оценок по событию(Сортировка: Самые новые и полезные, высокий рейтинг, низкий рейтинг);
- Получение подробной информации об оценке;
- Можно так же оставить комментарий, но не обязательно.
