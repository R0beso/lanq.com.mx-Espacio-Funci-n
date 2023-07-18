import { Link } from "react-router-dom"
import PropTypes from 'prop-types';

export const GridItem = ({id, gridItems}) => {
    return (
        <div className={`grid${id}`}>
            {
                gridItems.map((item, index) => (
                    <article className="item" key={index}>
                        <Link to={item.to}>
                            <img loading="lazy" src={item.imgSrc} alt={item.alt} className={`gird${id}-img`} />
                            <div className={`divgird${id}`} data-aos-useclassnames={false} data-aos="flip-left" data-aos-easing="ease-out-cubic" data-aos-duration="900">
                                <h4 className={`gird${id}-title`}>{item.title}</h4>
                                <i className={item.iconClass}></i>
                            </div>
                        </Link>
                    </article>
                ))
            }
        </div>
    )
}

GridItem.propTypes = {
    id: PropTypes.number.isRequired,
    gridItems: PropTypes.arrayOf(
        PropTypes.shape({
            to: PropTypes.string.isRequired, imgSrc: PropTypes.string.isRequired,
            alt: PropTypes.string.isRequired, title: PropTypes.string.isRequired,
            iconClass: PropTypes.string.isRequired,
        })
    ).isRequired,
};