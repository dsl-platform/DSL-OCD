package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneBinaries_3 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _oneSetOfOneBinaries: Set[Array[Byte]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneBinaries_3 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneBinaries_3("+ URI +")"

   def copy(oneSetOfOneBinaries: Set[Array[Byte]] = this._oneSetOfOneBinaries): OneSetOfOneBinaries_3 = {

  require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
  com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)
    new OneSetOfOneBinaries_3(_URI = this.URI, __locator = this.__locator, _ID = _ID, _oneSetOfOneBinaries = oneSetOfOneBinaries)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneBinaries_3): this.type = {
    this._URI = result._URI
    this._oneSetOfOneBinaries = result._oneSetOfOneBinaries
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.OneSetOfOneBinaries_3](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneSetOfOneBinaries")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneBinaries = {
    _oneSetOfOneBinaries
  }

  def oneSetOfOneBinaries_= (value: Set[Array[Byte]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _oneSetOfOneBinaries = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneBinaries") oneSetOfOneBinaries: Set[Array[Byte]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _oneSetOfOneBinaries = if (oneSetOfOneBinaries == null) Set.empty else oneSetOfOneBinaries)

}

object OneSetOfOneBinaries_3 extends AggregateRootCompanion[OneSetOfOneBinaries_3]{

  def apply(
    oneSetOfOneBinaries: Set[Array[Byte]] = Set.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(oneSetOfOneBinaries)
    require(oneSetOfOneBinaries ne null, "Null value was provided for property \"oneSetOfOneBinaries\"")
    new OneSetOfOneBinaries_3(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _oneSetOfOneBinaries = oneSetOfOneBinaries)
  }

}
