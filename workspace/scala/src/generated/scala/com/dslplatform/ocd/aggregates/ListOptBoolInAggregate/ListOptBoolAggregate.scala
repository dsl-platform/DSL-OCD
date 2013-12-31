package com.dslplatform.ocd.aggregates.ListOptBoolInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration
import com.fasterxml.jackson.annotation._

class ListOptBoolAggregate @JsonIgnore() private(
    private var _URI: String,
    @transient private val _locator: Option[ServiceLocator],
    private var _listOptBool: IndexedSeq[Option[Boolean]]
  ) extends Serializable with AggregateRoot {

  @JsonGetter("URI")
  def URI = {
    _URI
  }

  private[ListOptBoolInAggregate]def URI_= (value: String) {
    _URI = value

  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: ListOptBoolAggregate => c.URI == URI
    case _ => false
  }

  override def toString = "ListOptBoolAggregate("+ URI +")"

  @transient private lazy val _crudProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[CrudProxy]
  @transient private lazy val _domainProxy = _locator.getOrElse(Bootstrap.getLocator()).resolve[DomainProxy]

  def updateWithAnother(result: com.dslplatform.ocd.aggregates.ListOptBoolInAggregate.ListOptBoolAggregate): this.type = {
    this.URI = result.URI;
    this._listOptBool = result._listOptBool;
    this
  }
  def delete()(implicit ec: ExecutionContext, duration: Duration) =
    Await.result( _crudProxy.delete[com.dslplatform.ocd.aggregates.ListOptBoolInAggregate.ListOptBoolAggregate](URI), duration)

  def persist()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result((if (this.URI == null) _crudProxy.create(this) else _crudProxy.update(this)), duration)
    updateWithAnother(toUpdateWith)

  }

  @JsonGetter("listOptBool")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  def listOptBool = {
    _listOptBool
  }

  def listOptBool_= (value: IndexedSeq[Option[Boolean]]) {
    _listOptBool = value

  }

  @JsonCreator private def this(
    @JacksonInject("_locator") _locator: ServiceLocator
  , @JsonProperty("URI") URI: String
  , @JsonProperty("listOptBool") listOptBool: IndexedSeq[Option[Boolean]]
  ) =
    this(_locator = Some(_locator), _URI = URI, _listOptBool = if (listOptBool == null) IndexedSeq.empty else listOptBool)

}

object ListOptBoolAggregate extends AggregateRootCompanion[ListOptBoolAggregate]{

  def apply(
    listOptBool: IndexedSeq[Option[Boolean]] = IndexedSeq[Option[Boolean]]()
  ) = {
    new ListOptBoolAggregate(
      _locator = None
    , _URI = null
    , _listOptBool = listOptBool)
  }

}
