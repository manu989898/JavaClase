document.addEventListener('DOMContentLoaded', () => {
    // Parallax effect for project image
    window.addEventListener('scroll', () => {
        const projectImage = document.querySelector('.project-image img');
        const scrollPosition = window.pageYOffset;
        projectImage.style.transform = `translateY(${scrollPosition * 0.1}px)`;
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

    // Gallery image modal
    const galleryImages = document.querySelectorAll('.gallery-grid img');
    galleryImages.forEach(img => {
        img.addEventListener('click', () => {
            const modal = document.createElement('div');
            modal.className = 'image-modal';
            modal.innerHTML = `
                <div class="modal-content">
                    <img src="${img.src}" alt="${img.alt}">
                </div>
            `;
            document.body.appendChild(modal);

            modal.addEventListener('click', () => {
                modal.remove();
            });
        });
    });
});