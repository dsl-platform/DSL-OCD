package com.dslplatform.ocd.aggregates.ListDecimalInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListDecimalAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listDecimal: IndexedSeq[BigDecimal]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListDecimalInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListDecimalAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListDecimalAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListDecimalInAggregate.ListDecimalAggregate): this.type = {
    this.URI = result.URI;
    this._listDecimal = result._listDecimal;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListDecimalInAggregate.ListDecimalAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listDecimal")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listDecimal = {
    _listDecimal
  }

  def listDecimal_= (value: IndexedSeq[BigDecimal]) {
    _listDecimal = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listDecimal") listDecimal: IndexedSeq[BigDecimal]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listDecimal = if (listDecimal == null) IndexedSeq.empty else listDecimal)

}

object ListDecimalAggregate extends AggregateRootCompanion[ListDecimalAggregate]{

  def apply(
    listDecimal: IndexedSeq[BigDecimal] = IndexedSeq[BigDecimal]()
  ) = {
    new ListDecimalAggregate(
      _locator = None
    , _URI = null
    , _listDecimal = listDecimal)
  }

}
