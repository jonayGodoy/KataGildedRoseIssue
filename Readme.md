Kata Objective

Add the new requirement, the item "Conjured" in a difficult to maintain code.

Before to change the legacy code we need to create test to ensure we don't introduce any bug into production.

Luckily we know how to use it and the requirements.
Gilded Rose Requirements Specification

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods. Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We have a system in place that updates our inventory for us. It was developed by a no-nonsense type named Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that we can begin selling a new category of items. First an introduction to our system:

- All items have a SellIn value which denotes the number of days we have to sell the item
- All items have a Quality value which denotes how valuable the item is
- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

- Once the sell by date has passed, Quality degrades twice as fast
- The Quality of an item is never negative
- "Aged Brie" actually increases in Quality the older it gets
- The Quality of an item is never more than 50
- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
- "Backstage passes",
    - Increases in Quality as it's SellIn value approaches
    - Quality increases by 2 when there are 10 days or less
    - By 3 when there are 5 days or less but
    - Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

- "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly. However, do not alter the main.Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover for you).

Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a legendary item and as such its Quality is 80 and it never alters.
Important files

    Tests file: test.GildedRoseTest
    Code: main.GildedRose (and main.Item)

Sample of test solution
Objetivo Kata

Añadir el nuevo requisito, el elemento "Conjured" en un código difícil de mantener.

Antes de cambiar el código heredado necesitamos crear prueba para asegurar que no introducimos ningún error en la producción.

Por suerte sabemos cómo usarlo y los requisitos.
Gilded Rose Requisitos Especificación

Hola y bienvenidos al equipo Gilded Rose. Como saben, somos una pequeña posada con una ubicación privilegiada en una ciudad prominente dirigida por un simpático posadero llamado Allison. También compramos y vendemos solamente las mercancías más finas. Desafortunadamente, nuestras mercancías están constantemente degradando en calidad mientras que acercan su fecha de caducidad. Tenemos un sistema en el lugar que actualiza nuestro inventario para nosotros. Fue desarrollado por un tipo no-absurdo llamado Leeroy, que se ha trasladado a nuevas aventuras. Su tarea es agregar la nueva característica a nuestro sistema para que podamos comenzar a vender una nueva categoría de artículos. Primero una introducción a nuestro sistema:

- Todos los artículos tienen un valor SellIn que denota el número de días que tenemos para vender el artículo
- Todos los artículos tienen un valor de la calidad que denota cuán valioso es el artículo
- Al final de cada día, nuestro sistema reduce los valores para cada elemento

Bastante simple, ¿verdad? Bueno, aquí es donde se pone interesante:

- Una vez transcurrida la fecha de caducidad, la calidad se degrada dos veces más rápido
- La calidad de un artículo nunca es negativa
- "Brie envejecido" en realidad aumenta en calidad más viejo consigue
- La calidad de un artículo nunca es superior a 50
- "Sulfuras", siendo un artículo legendario, nunca tiene que venderse o disminuir en Calidad
- "Pase de bastidores",
    - Aumentos en la calidad como es SellIn enfoques de valor
    - La calidad aumenta en 2 cuando hay 10 días o menos
    - Por 3 cuando hay 5 días o menos pero
    - La calidad baja a 0 después del concierto

Recientemente hemos firmado un proveedor de artículos conjurados. Esto requiere una actualización de nuestro sistema:

- Los artículos "conjurados" se degradan en calidad dos veces más rápido que los artículos normales

Solo por aclaración, un artículo nunca puede tener un aumento de calidad superior a 50, sin embargo, "Sulfuras" es un elemento legendario y, como tal, su calidad es 80 y nunca cambia.

Siéntase libre de realizar cualquier cambio en el método UpdateQuality y agregar cualquier código nuevo, siempre y cuando todo funcione correctamente. Sin embargo, no modifique la propiedad main.Item o Items, ni cree nuevas clases.
Important files

    Tests file: test.GildedRoseTest
    Code: main.GildedRose (and main.Item)
