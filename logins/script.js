document.addEventListener('DOMContentLoaded', () => {
    // Smooth scrolling for navigation links
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });

    // Parallax effect for hero section
    window.addEventListener('scroll', () => {
        const hero = document.querySelector('.hero');
        const scrollPosition = window.pageYOffset;
        hero.style.backgroundPositionY = scrollPosition * 0.7 + 'px';
    });

    // Skill hover effect
    const skillItems = document.querySelectorAll('.skill-item');
    skillItems.forEach(item => {
        //añadir evento para cuando el mouse pase por encima
        item.addEventListener('mouseover', () => {
            //modificar el tamaño y rotación del elemento
            item.style.transform = `scale(1.1) rotate(${Math.random() * 10 - 5}deg)`;
        });
        //añadir evento para cuando el mouse salga del elemento
        item.addEventListener('mouseout', () => {
            //restablecer el tamaño y rotación del elemento
            item.style.transform = 'scale(1) rotate(0deg)';
        });
    });

    // Project card hover effect
    const projectCards = document.querySelectorAll('.project-card');
    projectCards.forEach(card => {
        //añadir evento para cuando el mouse pase por encima
        card.addEventListener('mousemove', (e) => {
            //obtener la posición del mouse dentro del elemento
            const rect = card.getBoundingClientRect();
            //calcular la posición del mouse en relación al elemento
            const x = e.clientX - rect.left;
            const y = e.clientY - rect.top;
            //establecer las propiedades CSS --mouse-x y --mouse-y  
            card.style.setProperty('--mouse-x', `${x}px`);
            card.style.setProperty('--mouse-y', `${y}px`);
        });
    });

    // Tooltip for language icons
    const languageIcons = document.querySelectorAll('.project-languages i');
    languageIcons.forEach(icon => {
    icon.addEventListener('mouseover', (e) => {
        const tooltip = document.createElement('div');
        tooltip.className = 'tooltip';
        tooltip.textContent = e.target.getAttribute('title');
        document.body.appendChild(tooltip);
        const rect = e.target.getBoundingClientRect();
        tooltip.style.top = `${rect.bottom + 5}px`;
        tooltip.style.left = `${rect.left + rect.width/2 - tooltip.offsetWidth/2}px`;
    });
    
    icon.addEventListener('mouseout', () => {
        const tooltip = document.querySelector('.tooltip');
        if (tooltip) {
            tooltip.remove();
        }
    });
});
});